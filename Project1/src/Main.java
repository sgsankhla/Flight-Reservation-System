import javax.swing.*;
       //
public class Main {
           public Main() {
           }

           public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket();
        Ticket touristTicket = new TouristTicket();
        printTicketDetails(regularTicket);
        printTicketDetails(regularTicket);

    }
    public static void printTicketDetails(Ticket ticket){
       System.out.println("PNR is : ");
    }



}
