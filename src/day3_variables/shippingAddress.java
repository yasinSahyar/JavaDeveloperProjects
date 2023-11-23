package day3_variables;

public class shippingAddress {
    public static void main(String[] args) {
        String name = "Yasin Sahyar";
        String buildingNumber = "C 26";
        String streetName = "kamnerentie 3";
        String city = "Helsinki";
        String sate = "Ussimaa";
        String zipCode = "00750";
        String country = "Finland";

        System.out.println("Your shipping address is :");
        System.out.println("\t" + name);
        System.out.println("\t" + " " + streetName +buildingNumber);
        System.out.println("\t" + city + "," + sate + "" + zipCode);
        System.out.println("\t" + country );

        System.out.println("Your shipping address is :\n\t" + name +
                "\n\t" + streetName + " " + buildingNumber +
                "\n\t" + city + "," + sate + " " + zipCode  + "\n\t" +country);

    }
}
