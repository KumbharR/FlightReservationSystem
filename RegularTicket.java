package FlightReservationSystem;

public class RegularTicket extends Tickets {
    private String specialServices;

    public RegularTicket(int PNR_no, String departure, String destination, String seatNo, float ticketPrice, String arrivalDateTime, String depatureDateTime, Flight flight, Passenger passenger, boolean ticketStatus, String journeyTime) {
        super(PNR_no, departure, destination, seatNo, ticketPrice, arrivalDateTime, depatureDateTime, flight, passenger, ticketStatus, journeyTime);
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){
        return specialServices;
    }
    public void setSpecialServices(String updateService) {
        specialServices = updateService;

    }
}
