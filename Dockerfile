FROM openjdk:8
EXPOSE 8080
ADD target/jenkins-docker-kubernates-appmicroservice.jar jenkins-docker-kubernates-appmicroservice.jar
ENTRYPOINT ["java", "-jar", "/jenkins-docker-kubernates-appmicroservice.jar"]