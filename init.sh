#!/bin/bash
# init.sh — первичная установка: получаем SSL и запускаем всё
set -e

if [ ! -f .env ]; then
    cp .env.example .env
    echo "Создан .env — заполни переменные и запусти снова."
    echo "Created .env — fill in the variables and run again."
    exit 1
fi

source .env

if [ -z "$DOMAIN" ] || [ -z "$CERTBOT_EMAIL" ] || [ -z "$ADMIN_PASS" ]; then
    echo "Заполни DOMAIN, CERTBOT_EMAIL и ADMIN_PASS в .env"
    exit 1
fi

echo "[1/4] Освобождаем порты 80 и 443..."
systemctl stop nginx apache2 httpd 2>/dev/null || true
fuser -k 80/tcp 443/tcp 2>/dev/null || true
sleep 1

echo "[2/4] Собираем образ..."
docker compose build

echo "[3/4] Запускаем nginx на HTTP для получения сертификата..."
docker compose up -d nginx
sleep 3

echo "[4/4] Получаем SSL сертификат..."
docker compose run --rm certbot
sleep 2

echo "[5/5] Запускаем всё..."
docker compose up -d

echo ""
echo "=============================="
echo "  Panel: https://$DOMAIN"
echo "  Login: $ADMIN_LOGIN"
echo "  Pass:  $ADMIN_PASS"
echo "=============================="
echo ""
echo "Логи: docker compose logs -f panel"
