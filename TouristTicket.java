package FlightReservationSystem;

public class TouristTicket extends Tickets {
    private int index=0;
    private String hotelAddress;
    private String[] touristLoc = new String[5];



    public void getTouristLocations(){
        System.out.println(touristLoc);
    }
    public TouristTicket(int PNR_no, String departure, String destination, String seatNo, float ticketPrice, String arrivalDateTime, String depatureDateTime, Flight flight, Passenger passenger, boolean ticketStatus, String journeyTime) {
        super(PNR_no, departure, destination, seatNo, ticketPrice, arrivalDateTime, depatureDateTime, flight, passenger, ticketStatus, journeyTime);

        this.hotelAddress = hotelAddress;
        this.touristLoc = touristLoc;
    }

    public void addTouristLocation(String selectedTouristLocation){
        touristLoc[index] = selectedTouristLocation;
        index++;
    }
    public void removeTouristLocation(int locationIndex){
        touristLoc[locationIndex]=null;
        System.out.println(touristLoc);
    }

    public String[] getSelectedLocations() {
        return touristLoc;
    }

    public void setSelectedLocations(String[] selectedLocations) {
        this.touristLoc = selectedLocations;
    }
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
