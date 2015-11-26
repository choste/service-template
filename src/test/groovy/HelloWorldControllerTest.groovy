import hello.HelloWorldController
import spock.lang.Specification

class HelloWorldControllerTest extends Specification {

    def 'Hello controller returns hello'() {
        given: "a hello controller"
        def helloWorldController = new HelloWorldController()

        when: "the method hello is called"
        def response = helloWorldController.hello()

        then: "a string hello is returned"
        "hello".equals(response)
    }

}