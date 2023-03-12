FROM openjdk:8
COPY $PWD/hellospring-1.0-SNAPSHOT.jar /
ENV MYSQL_ADDR=www.wwhzz.top:4000/zz
CMD ["java", "-jar", "hellospring-1.0-SNAPSHOT.jar"]