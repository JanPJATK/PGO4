public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetName;
    private String apartmentNumber;

    public String createAddress(String country) {
        this.country = country;
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city) {
        this.country = country;
        this.city = city;
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, String postalCode) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    public String createAddress(String country, String city, String postalCode, String streetName) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetName = streetName;
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, streetName);
    }

    public String createAddress(String country, String city, String postalCode, String streetName, String apartmentNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, Apartment: %s", country, city, postalCode, streetName, apartmentNumber);
    }

    public static void main(String[] args) {
        Address address = new Address();
        System.out.println(address.createAddress("Poland"));
        System.out.println(address.createAddress("Poland", "Warsaw"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-000"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-000", "Ulica"));
        System.out.println(address.createAddress("Poland", "Warsaw", "00-000", "Ulica", "1"));
    }
}

