package in.sp.main;

import in.sp.beans.Student;

import in.sp.resouces.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

       // Student std =  context.getBean(Student.class);

//        Student std = (Student) context.getBean("stdObj");
//
//        std.display();

        Student std1 = (Student) context.getBean("stdObj1");
        std1.display();

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++"  );
        Student std2 = (Student) context.getBean("stdObj2");
        std2.display();

    }
}