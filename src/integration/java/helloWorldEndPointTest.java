import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class helloWorldEndPointTest {
    @Test
    public void testGet() {
        when().get("http://localhost:8080/hello").then().statusCode(200);
    }
}
