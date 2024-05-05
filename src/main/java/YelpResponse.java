// API response class to map JSON to Java opbjects
public class YelpResponse {

    public Business[] businesses;
}

// Class helps process the business return data by Yelp API
class Business {
    public String name;
    public double rating;
    public Location location;
}

// Class for location of business
class Location {
    public String city;
    public String address;
}