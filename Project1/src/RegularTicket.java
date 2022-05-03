public class RegularTicket extends Ticket {

    private String[] specialService;

    public RegularTicket(int PNR, String name, String phone, String email, String address, String city, String departureLocation,
                         String destinationLocation, Flight flight, Passenger passenger, String[] specialService) {
        super(PNR, name, phone, email, address, city, departureLocation, destinationLocation, flight, passenger);
        this.specialService = specialService;
    }

    public RegularTicket() {
        super();
    }

    public String[] getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String[] specialService) {
        this.specialService = specialService;
    }
}
