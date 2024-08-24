package in.sp.main;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  class  Main {

    public static void main(String[] args)  {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String config ="/in/sp/resources/applicationContext.xml";

        ApplicationContext context=new ClassPathXmlApplicationContext(config);

        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}
