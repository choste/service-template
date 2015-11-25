import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import static com.jayway.restassured.RestAssured.*;

public class HelloWorldEndPointTest {

    @Before
    public void setup() {
        RestAssured.baseURI = System.getProperty("gretty.baseURI");
    }

    @Test
    public void testGet() {
        when().get("/hello").then().statusCode(200);
    }
}
