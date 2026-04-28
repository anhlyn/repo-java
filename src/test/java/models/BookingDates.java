package models;

public class BookingDates {
    private String checkin;
    private String checkout;

    public String getCheckin(){
        return checkin;
    }

    public String getCheckout(){
        return checkout;
    }

    public void setCheckin(String ci){
        checkin = ci;
    }

    public void setCheckout(String co){
        checkout = co;
    }
}
