## AutoGuru Data Access and Persistence
The application provides data for autoguru-mobile and autoguru-site.

### Build
Application uses Maven for dependency management and builds.

#### Compile and package

```mvn clean package```

#### Build docker files and deploy to AWS

First boot2docker needs to be started.

```
mvn clean package docker:build
cd target/docker
zip autoguru-dap.zip *
```

Upload the zipped file to AWS beanstalk docker instance.
 
### Test
Tests are disabled by default to speed-up builds, enable and run tests with the following command.

```mvn clean test -Dmaven.test.skip=false```

### Run
 * Run using ```spring-boot-maven-plugin```
```mvn clean boot:run```
 * Run using the built jar
 
```
cd target
java -jar autoguru-dap.jar
```


