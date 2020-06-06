# lifelog
Another todo program.

How to run project:
1. Create src/main/resources/app.properties file and 'ok_message' property (for example ok_message=OK)
2. Build project with mvn clean install
3. Deploy target/lifelog.war to Tomcat server.
4. Check your_host:your_port/lifelog/isOK (for example localhost:8080/lifelog/isOK) - it should return your oc_message from app.properties
