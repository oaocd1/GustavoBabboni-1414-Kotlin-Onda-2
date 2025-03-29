FROM openjdk:17-alpine

WORKDIR /app

COPY . /app

RUN apk add --no-cache bash && \
    wget -O kotlin-compiler.zip https://github.com/JetBrains/kotlin/releases/download/v1.9.0/kotlin-compiler-1.9.0.zip && \
    unzip kotlin-compiler.zip -d /opt/kotlin && \
    rm kotlin-compiler.zip && \
    ln -s /opt/kotlin/bin/kotlinc /usr/local/bin/kotlinc && \
    ln -s /opt/kotlin/bin/kotlin /usr/local/bin/kotlin

RUN mkdir -p /app/out && \
    for file in *.kt; do kotlinc "$file" -include-runtime -d "/app/out/${file%.kt}.jar"; done

CMD ["bash"]
