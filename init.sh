#!/bin/bash
# init.sh — первичная установка панели
set -e

if [ ! -f .env ]; then
    cp .env.example .env
    echo "Создан .env — заполни переменные и запусти снова."
    exit 1
fi

source .env

if [ -z "$DOMAIN" ] || [ -z "$CERTBOT_EMAIL" ] || [ -z "$ADMIN_PASS" ]; then
    echo "Заполни DOMAIN, CERTBOT_EMAIL и ADMIN_PASS в .env"
    exit 1
fi

echo "[1/4] Останавливаем процессы на портах 80/443..."
systemctl stop nginx apache2 httpd 2>/dev/null || true
fuser -k 80/tcp 443/tcp 2>/dev/null || true
sleep 1

# SSL сертификат
if [ -f "/etc/letsencrypt/live/$DOMAIN/fullchain.pem" ]; then
    echo "[2/4] Сертификат уже есть — пропускаем certbot."
else
    echo "[2/4] Получаем SSL сертификат..."
    apt-get install -y certbot 2>/dev/null || true
    certbot certonly --standalone -d "$DOMAIN" \
        --email "$CERTBOT_EMAIL" --agree-tos --non-interactive
fi

echo "[3/4] Собираем образ..."
docker compose build

echo "[4/4] Запускаем..."
docker compose up -d

sleep 3
docker compose ps

echo ""
echo "=============================="
echo "  Panel: https://$DOMAIN"
echo "  Login: ${ADMIN_LOGIN:-admin}"
echo "  Pass:  $ADMIN_PASS"
echo "=============================="
echo "Логи: docker compose logs -f panel"
