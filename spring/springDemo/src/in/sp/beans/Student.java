package in.sp.beans;

public class Student {

    private String name;

    private int roll_no;

    public String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", email='" + email + '\'' +
                '}';
    }
    public void display(){

        System.out.println("name :"+ name);
        System.out.println("roll_no :"+ roll_no);
        System.out.println("email  :"+ email);
    }
}
