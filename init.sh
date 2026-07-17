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

echo "[1/4] Собираем образ..."
docker compose build

echo "[2/4] Запускаем nginx на HTTP для получения сертификата..."
# Временный nginx только на 80 для ACME challenge
docker compose up -d nginx
sleep 3

echo "[3/4] Получаем SSL сертификат..."
docker compose run --rm certbot
sleep 2

echo "[4/4] Запускаем всё..."
docker compose up -d

echo ""
echo "=============================="
echo "  Panel: https://$DOMAIN"
echo "  Login: $ADMIN_LOGIN"
echo "  Pass:  $ADMIN_PASS"
echo "=============================="
echo ""
echo "Логи: docker compose logs -f panel"
