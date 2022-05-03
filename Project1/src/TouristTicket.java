public class TouristTicket extends Ticket {

    String hotelAddress;
    String[] touristLocation;

    public TouristTicket(int PNR, String name, String phone, String email, String address, String city,
                         String departureLocation, String destinationLocation,
                         Flight flight, Passenger passenger, String hotelAddress, String[] touristLocation) {

        super(PNR, name, phone, email, address, city, departureLocation, destinationLocation, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }
    public TouristTicket(){}

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocation(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }
}
