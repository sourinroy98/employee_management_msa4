FROM openjdk:17
ADD target/Employee_management_msa4-0.0.1-SNAPSHOT.jar app1.jar
ENTRYPOINT ["java","-jar","/app1.jar"]