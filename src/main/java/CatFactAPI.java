import kong.unirest.Unirest;
import kong.unirest.apache.ApacheClient;

public class CatFactAPI {

    public static void main(String[] args) {
        // URL of API cat facts
        String url = "https://catfact.ninja/fact";

        // Get request for API cat facts
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();

        // Prints cat fact
        System.out.println(catFact.fact);

        // Retrieves length of the cat fact
        int factLength = catFact.length;
        System.out.println("The fact is " + factLength + " characters long");

    }
}

// Class that represents a cat fact
class CatFact {

    // Cat fact
    public String fact;

    // Length of cat fact
    public int length;
}
