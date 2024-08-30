#defining the floryn-hapi-fhir-extn docker image
FROM mirror.gcr.io/library/openjdk:17
LABEL maintainer="ReadBookPage"
ADD target/ReadBookPage-0.0.1.jar ReadBookPage.jar
# Copy the JSON file to the container
#COPY src/main/resources/storage/gcloud/development-402207-35ac4749b133.json /app/development-402207-35ac4749b133.json
#ENV storage_json_path=/app/development-402207-35ac4749b133.json

#COPY src/main/resources/encryption/private-key.pem /app/private-key.pem
#ENV private_key_path = /app/private-key.pem
EXPOSE 2525
ENTRYPOINT ["java", "-jar", "ReadBookPage.jar"]