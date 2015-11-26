# Service Template
This is a template project that can be used as a base for other web services.

### build project
    ./gradlew buildProduct
the combination of spring boot and gretty has you build a gretty product, which is a self contained
app, container and scripts for managing the container.

[gretty product](http://akhikhl.github.io/gretty-doc/Product-generation.html)

to run the from the project root after building run the following:

    ./build/output/service-template/run.sh

### run unit tests
    ./gradlew test

### run integration tests
    ./gradlew integrationTest

### run the service locally
    ./gradlew appRun
