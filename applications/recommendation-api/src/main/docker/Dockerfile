FROM frolvlad/alpine-oraclejdk8:8.131.11-slim
ENV DCONFIG ""
ENV LOG_LOCATION /var/log/applogs
CMD mkdir /var/log/applogs
CMD chmod +777 /var/log/applogs
COPY recommendation-api-1.0.jar /etc/recommendation-api/app.jar
CMD java -Xmx512M -Dapplication_properties_path="$APPLICATION_PROPERTIES_PATH" -Dservice_properties_path="$SERVICE_PROPERTIES_PATH" -Dlog.file="$LOG_LOCATION"app.log -jar /etc/recommendation-api/app.jar