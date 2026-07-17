FROM golang:1.25-bookworm AS builder

WORKDIR /build
COPY source/ .
RUN go build -o server ./cmd/server/

# ── Runtime ────────────────────────────────────────────────────────
FROM debian:bookworm-slim

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y --no-install-recommends \
    openjdk-17-jre-headless \
    apksigner \
    zipalign \
    ca-certificates \
    curl \
    && rm -rf /var/lib/apt/lists/*

# apktool
RUN curl -sL https://github.com/iBotPeaches/Apktool/releases/download/v2.10.0/apktool_2.10.0.jar \
        -o /usr/local/lib/apktool.jar && \
    printf '#!/bin/sh\nexec java -jar /usr/local/lib/apktool.jar "$@"\n' \
        > /usr/local/bin/apktool && \
    chmod +x /usr/local/bin/apktool

WORKDIR /app
COPY --from=builder /build/server ./server
COPY source/web/ ./web/
COPY source/decom/ ./decom/

RUN mkdir -p data

ENV PORT=443
ENV LISTEN_PORT=8080
ENV REGISTRATION=closed

EXPOSE 8080

CMD ["./server"]
