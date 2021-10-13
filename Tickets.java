package FlightReservationSystem;

public abstract class Tickets {
        private int PNR_no;
        private String departure,destination,seatNo,depatureDateTime,arrivalDateTime,journeyTime;
        private float ticketPrice;
        private Flight flight;
        private Passenger passenger;
        private boolean ticketStatus;

        public Tickets(int PNR_no,String departure, String destination,String seatNo,float ticketPrice,String arrivalDateTime,String depatureDateTime,
                       Flight flight, Passenger passenger,boolean ticketStatus,String journeyTime){
            this.PNR_no=PNR_no;
            this.departure=departure;
            this.destination=destination;
            this.seatNo=seatNo;
            this.ticketPrice=ticketPrice;
            this.depatureDateTime=depatureDateTime;
            this.arrivalDateTime=arrivalDateTime;
            this.flight=flight;
            this.passenger=passenger;
            this.ticketStatus=ticketStatus;
            this.journeyTime=  journeyTime;
        }
        public String cancleTicket(String PNR_No){
            this.PNR_no=PNR_no;
            ticketStatus=false;
            return "Your Ticket Status is "+ticketStatus+"This ticket is cancelled";

        }



    public void ticketStatus(){
        System.out.println("Ticket Booked: "+ticketStatus);
    }

    public void passengerDetails(){
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNumber(String seatNo) {
        this.seatNo = seatNo;
    }

    public int getPNR_no() {
        return PNR_no;
    }

    public void setPNR_no(int PNR_no) {
        this.PNR_no = PNR_no;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepatureDateTime() {
        return depatureDateTime;
    }

    public void setDepatureDateTime(String depatureDateTime) {
        this.depatureDateTime = depatureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setarrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(String journeyTime) {
        this.journeyTime = journeyTime;
    }
}

