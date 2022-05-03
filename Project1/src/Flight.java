public class Flight {

    int id;
    int FlightDate;
    String FlightDescription;
    String FlightType;

    public Flight(int id, int flightDate, String flightDescription, String flightType) {
        this.id = id;
        FlightDate = flightDate;
        FlightDescription = flightDescription;
        FlightType = flightType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlightDate() {
        return FlightDate;
    }

    public void setFlightDate(int flightDate) {
        FlightDate = flightDate;
    }

    public String getFlightDescription() {
        return FlightDescription;
    }

    public void setFlightDescription(String flightDescription) {
        FlightDescription = flightDescription;
    }

    public String getFlightType() {
        return FlightType;
    }

    public void setFlightType(String flightType) {
        FlightType = flightType;
    }
}












