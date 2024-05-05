import kong.unirest.Unirest;

public class ExchangeRateConverter {
    public static void main(String[] args) {

        // Url for the Exchange Rates API
        String url= "https://1150-exchange-rates.azurewebsites.net/latest?base=USD";

        // Get request for Exchange rates API
        RateResponse response = Unirest.get(url).asObject(RateResponse.class).getBody();

        // Retrieves date of when data is requested
        String dateRequested = response.date;

        // Retrieving the exchange rate from USD to EUR
        double rate = response.rates.EUR;

        // Printing final result from exchange rate data
        System.out.println("On " + dateRequested + " the exchange rate from USD to EUROS is " + rate);
    }
}

// Class that will help process the Exchange Rates API
class RateResponse {
    public String base;
    public String date;
    public Rates rates;
}

// Class rate that processes exchange rates
class Rates {
    public double EUR;
}
