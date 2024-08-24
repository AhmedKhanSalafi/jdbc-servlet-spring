package in.sp.beans;

public class Address {

    private int house_no;

    private String city;

    private int pincode;

    public Address(int house_no, String city, int pincode) {
        this.house_no = house_no;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house_no=" + house_no +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
