package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String config ="/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config);

        Student std = (Student) context.getBean("student");

        std.display();


    }
}