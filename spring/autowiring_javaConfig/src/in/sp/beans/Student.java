package in.sp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    private int roll_no;

    private String name;

    @Autowired
    @Qualifier("createAddObj")
    private Address address;

    @Autowired
    private Subject subject;

    public int getRoll_no() {


        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        System.out.println(" ListOfSubject :"+ subject);
    }

}
