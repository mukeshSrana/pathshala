package msr.pathshala.student.domain;

public class Address {

    private String addresstext;
    private String postnumber;
    private String cityname;
    private String country;

    public String getAddresstext() {
        return addresstext;
    }

    public String getPostnumber() {
        return postnumber;
    }

    public String getCityname() {
        return cityname;
    }

    public String getCountry() {
        return country;
    }

    public static AddressBuilder address() {
        return new AddressBuilder(new Address());
    }

    public static class AddressBuilder {

        protected final Address address;

        protected AddressBuilder(Address address) {
            this.address = address;
        }

        public Address build() {
            return address;
        }

        public AddressBuilder addresstext(String addresstext) {
            address.addresstext = addresstext;
            return this;
        }

        public AddressBuilder postnumber(String postnumber) {
            address.postnumber = postnumber;
            return this;
        }

        public AddressBuilder cityname(String cityname) {
            address.cityname = cityname;
            return this;
        }

        public AddressBuilder country(String country) {
            address.country = country;
            return this;
        }

    }
}
