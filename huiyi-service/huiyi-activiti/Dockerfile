FROM openjdk:11.0.5
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo "Asia/Shanghai" > /etc/timezone
COPY target/*.jar ./app.jar
CMD ["sh","-c","java $JAVA_OPTS -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError -Djava.security.egd=file:/dev/urandom -jar ./app.jar --spring.profiles.active=qa $PROJECT_OPTS"]