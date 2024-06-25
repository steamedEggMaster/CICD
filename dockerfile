# Zulu OpenJDK 17 기반의 Alpine 이미지 사용
FROM azul/zulu-openjdk-alpine:17-jre

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일을 컨테이너로 복사
COPY build/libs/CICD-0.0.1.jar /app/app.jar

# 애플리케이션 실행 명령어 설정
ENTRYPOINT ["java", "-jar", "/app/app.jar"]