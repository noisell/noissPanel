#!/bin/bash
# update.sh — деплой обновлений
set -e

echo "[1/3] Получаем обновления..."
git pull

echo "[2/3] Пересобираем образ..."
docker compose build panel

echo "[3/3] Перезапускаем панель..."
docker compose up -d panel

echo ""
docker compose logs panel --tail=10
echo "Done."
