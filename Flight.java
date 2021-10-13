package FlightReservationSystem;

    public   class Flight {
    private String flightNumber,airline;
    private int capacity, bookedSeat;

    public Flight(String flightNumber, String airline, int capacity,int bookedSeat) {
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeat=bookedSeat;
    }
    public String getFlightDetails(String flightNumber, String airline, int capacity,int bookedSeat) {
        return flightNumber+" "+ airline+ " "+capacity+" "+bookedSeat;
    }
    public void checkAvailability(){
        int availableSeats = capacity - bookedSeat;
        System.out.println("Available Seats: "+availableSeats);
    }
    public void updatedBookedSeat(){
        bookedSeat++;
    }
}
