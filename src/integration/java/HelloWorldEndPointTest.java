import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;

public class HelloWorldEndPointTest {
    @Test
    public void testGet() {
        when().get("http://localhost:8080/hello").then().statusCode(200);
    }
}
