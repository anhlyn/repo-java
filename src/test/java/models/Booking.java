package models;

public class Booking {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public int getTotalprice(){
        return totalprice;
    }

    public boolean getDepositpaid(){
        return depositpaid;
    }

    public BookingDates getBookingdates(){
        return bookingdates;
    }

    public String getAdditionalneeds(){
        return additionalneeds;
    }

    public void setFirstname(String fn){
        firstname = fn;
    }

    public void setLastname(String ln){
        lastname = ln;
    }

    public void setTotalprice(int total){
        totalprice = total;
    }

    public void setDepositpaid(boolean dppaid){
        depositpaid = dppaid;
    }

    public void setBookingdates(BookingDates bkdates){
        bookingdates = bkdates;
    }

    public void setAdditionalneeds(String an){
        additionalneeds = an;
    }
}
