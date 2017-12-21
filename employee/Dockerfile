FROM java:8
VOLUME /tmp
ADD build/libs/employee.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]