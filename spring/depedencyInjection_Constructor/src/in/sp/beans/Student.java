package in.sp.beans;

public class Student {

    private int roll_no;

    private String name;

    private Address address;


    public Student(int roll_no, String name, Address address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }public void display(){

        System.out.println(" roll no :"+ roll_no);
        System.out.println(" name :"+ name);
        System.out.println(" Address :"+ address);
    }
}
