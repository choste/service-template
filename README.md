# Service Template
This is a template project that can be used as a base for other web services.

### build project
    ./gradlew build

Due to integration test being part of the build and not starting the app yet, you will need to
start the application separately with the following command.

    ./gradlew bootRun

### run unit tests
    ./gradlew test

### run integration tests
    ./gradlew integrationTest
