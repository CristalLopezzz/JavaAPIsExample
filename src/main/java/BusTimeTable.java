import kong.unirest.Unirest;

// Followed the video notes, but then I saw the notes at the bottom of the video where it states that the code wouldn't work
// I did check out the example code for the updated version, but I also had this code done
public class BusTimeTable {
    public static void main(String[] args) {
        // URL Metro Transit API
        String busTimeUrl = "http://svc.metrotransit.org/NexTrip/17940?format=json";

        // Get request to attain Metro Transit API
       Bus[] buses =Unirest.get(busTimeUrl).asObject(Bus[].class).getBody();

       // Print result of bus times
       System.out.println(System.out.printf("%-10s %-40s %-20s\n", "Route", "Description", "Arrival Time"));

       // If condition that will help define if the result is null
       if(buses != null) {
           for (Bus bus: buses) {
               System.out.printf("%-10s %-40s %-20s\n",bus.Route + bus.Description + bus.DepartureText);
       }
           } else { // If it's null it will print the following
           System.out.println("Error retrieving data");
       }
    }
}

// Class will be processing bus data
class Bus {
    // Departure time for bus
   public String DepartureText;

   // Route for bus
   public String Route;

   // Description for bus
   public String Description;
}
