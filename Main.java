package FlightReservationSystem;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("KF99", "Air India", 120, 68);
        Passenger passenger = new Passenger("ROHAN K", "+91 7741031045", "rohank@gmail.com",
                "Andheri Road", "Mumbai", "Maharashtra");

        RegularTicket regularTicket = new RegularTicket(2353 ,"Mumbai","Dubai","KF25",1250.65f,
                "20/10/2021 12.00 pm","21/10/2021 1.00 pm", flight,passenger,true,"13H");

        TouristTicket touristTicket = new TouristTicket(1234,"Mumbai","Goa","31P",6000.00f,
                "25/12/2021 8.00am ","25/12/2021 10.00am",flight,passenger,true,"2H");
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Tickets ticket){
        System.out.println(ticket.getPNR_no());
    }

}

