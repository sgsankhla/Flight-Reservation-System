public class Passenger{

     int flightDate ;
     int id;
     static String PassengerName;
     static String PassengerMobile;
     static String PassengerEmail;
     static String PassengerUsername;
     static String PassengerPassword;
     static String PassengerAddress;
     static double PassengercontNo;
     private static int idCounter;
     Contact contact;
     Address address;

    public Passenger(int flightDate, int id, Contact contact, Address address, int idCounter) {
        this.flightDate = flightDate;
        this.id = id;
        this.contact = contact;
        this.address = address;
        this.idCounter = idCounter;
    }

    public int getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(int flightDate) {
        this.flightDate = flightDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getPassengerName() {
        return PassengerName;
    }

    public static void setPassengerName(String passengerName) {
        PassengerName = passengerName;
    }

    public static String getPassengerMobile() {
        return PassengerMobile;
    }

    public static void setPassengerMobile(String passengerMobile) {
        PassengerMobile = passengerMobile;
    }

    public static String getPassengerEmail() {
        return PassengerEmail;
    }

    public static void setPassengerEmail(String passengerEmail) {
        PassengerEmail = passengerEmail;
    }

    public static String getPassengerUsername() {
        return PassengerUsername;
    }

    public static void setPassengerUsername(String passengerUsername) {
        PassengerUsername = passengerUsername;
    }

    public static String getPassengerPassword() {
        return PassengerPassword;
    }

    public static void setPassengerPassword(String passengerPassword) {
        PassengerPassword = passengerPassword;
    }

    public static String getPassengerAddress() {
        return PassengerAddress;
    }

    public static void setPassengerAddress(String passengerAddress) {
        PassengerAddress = passengerAddress;
    }

    public static double getPassengercontNo() {
        return PassengercontNo;
    }

    public static void setPassengercontNo(double passengercontNo) {
        PassengercontNo = passengercontNo;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Passenger.idCounter = idCounter;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private static class Contact{}

    private static class Address{}

    public int getPassengerCount(){
        return idCounter;
    }
}
