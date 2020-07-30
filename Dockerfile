FROM tomcat:jdk8-openjdk-slim
MAINTAINER "dbasak2013@gmail.com"
ADD target/*.war /usr/local/tomcat/webapps/mavenwebapp.war
CMD ["catalina.sh", "run"]