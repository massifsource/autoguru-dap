## AutoGuru Data Access and Persistence
The application provides data for autoguru-mobile and autoguru-site.

### Diagnostics
This is a Spring Boot application and comes with default diagnostic ```HTTP GET``` endpoints. In order to access the diagnostic information, one can issue an ```HTTP GET``` request to ```http://<ip-address-of-app-server>:<app-port>/<endpoint>```, where 

* ```ip-address-of-app-server``` is the hostname or IP of the server this application is running on.
* ```app-port``` is the port this application is using, it is usually configured in ```conf/env.cfg``` or ```conf/application.properties```
* ```endpoint``` is the name of Spring Boot's built-in diagnostic servlets, explained in more detail below. The request can be issued using a web browser or ```curl``` command, example below:

```curl -X GET <url>```

#### Spring Boot Diagnostics Endpoints
The Spring Boot Actuator endpoints are listed below, as well as in [Spring Boot Documentation](http://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html)

| ID	     | Description	 | 
|----------|----------------|
|```autoconfig```|Displays an auto-configuration report showing all auto-configuration candidates and the reason why they ‘were’ or ‘were not’ applied.|
|```beans```|Displays a complete list of all the Spring Beans in your application.|
|```configprops```|Displays a collated list of all @ConfigurationProperties.|
|```dump```|Performs a thread dump.|
|```env```|Exposes properties from Spring’s ConfigurableEnvironment.|
|```health```|Shows application health information (a simple ‘status’ when accessed over an unauthenticated connection or full message details when authenticated).|
|```info```|Displays arbitrary application info.|
|```metrics```|Shows ‘metrics’ information for the current application.|
|```mappings```|Displays a collated list of all @RequestMapping paths.|
|```shutdown```|Allows the application to be gracefully shutdown (not enabled by default).|
|```trace```|Displays trace information (by default the last few HTTP requests).|

