import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class FirstTS {

    public static final String URL = "https://restful-booker.herokuapp.com/";
    @Test
    public void GetBookingIds_Return200_OK(){
        given()
                .baseUri(URL)
                .when()
                .get("/booking")
                .then()
                .statusCode(200);
    }

    @Test
    public void GetBooking_Return200_OK(){
        given()
                .baseUri(URL)
                .when()
                .get("/booking/1")
                .then()
                .log().body()
                .statusCode(200);
                /*.body("firstname", Matchers.equalTo("Mary"))
                .body("lastname", Matchers.containsString("Smith"))
                .body("totalprice", Matchers.greaterThan(500))
                .body("bookingdates", Matchers.hasSize(2));*/
    }

}
