public final class Address {

    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;

    public Address(String street, String city, String state, String zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    // Only getters, no setters

    public Address withCity(String newCity) {   // "With" pattern
        return new Address(street, newCity, state, zipCode, country);
    }
}
