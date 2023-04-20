public class Customer {

    public static String getCustomer() {
        String name = String.valueOf(Main.getNameField());
        String street = String.valueOf(Main.getStreetField());
        String city = String.valueOf(Main.getCityField());
        String state = String.valueOf(Main.getStateField());
        String zip = String.valueOf(Main.getZipField());

        return name + "\n" + street + "\n" + city + ", " + state + " " + zip;
    }
}
