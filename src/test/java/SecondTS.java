import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SecondTS {

    @Test
    public void TC_Booker_HealthCheck(){
        given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                .get()
                .then()
                .statusCode(201)
                .statusLine(Matchers.containsString("Created"));
    }

}
