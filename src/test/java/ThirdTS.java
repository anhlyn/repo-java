import models.Booking;
import models.BookingDates;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class ThirdTS {

    @Test
    public void TC_CreateBooking_Return200OK_V1(){
        BookingDates bookingDates = new BookingDates();
        bookingDates.setCheckin("2026-05-01");
        bookingDates.setCheckout("2026-05-02");

        Booking payload = new Booking();
        payload.setFirstname("Linh");
        payload.setLastname("Tran");
        payload.setTotalprice(1200);
        payload.setDepositpaid(true);
        payload.setBookingdates(bookingDates);
        payload.setAdditionalneeds("Breakfast");

        Response res = given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post()
                .then()
                .extract()
                .response();

        int newBookingId = res.jsonPath().getInt("bookingid");
        Booking newBooking = res.jsonPath().getObject("booking", Booking.class);

        String fn = newBooking.getFirstname();
        String ln = newBooking.getLastname();
        Boolean isDepositPaid = newBooking.getDepositpaid();
        String checkin = newBooking.getBookingdates().getCheckin();
        String checkout = newBooking.getBookingdates().getCheckout();
    }

}
