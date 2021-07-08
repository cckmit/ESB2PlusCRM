# ESB2Plus CRM

This is an example of how to package and deploy a Spring Boot project as WAR on Tomcat.


- Add the plugin to your project's pom.xml:

```
<build>
  <finalName>example</finalName>
  <plugins>
    <plugin>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>
        <plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
      <configuration>
         <url>http://localhost:8080/manager/text</url>
         <server>localtomcat</server>
         <path>/example</path>
       </configuration>
        </plugin>
  </plugins>
</build>
```

- Start your tomcat

- Execute maven command for your project:  mvn clean tomcat7:redeploy

- Go to http://localhost:8080/example

- Verify your controller output

- https://gitlab.com/esb2plus/ESB2PlusCRM.git



