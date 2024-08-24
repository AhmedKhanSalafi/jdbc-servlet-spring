package in.sp.resouces;


import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean("stdObj1")
    public Student stdId1(){

        Student std = new Student();

        std.setName("Ahmed khan");
        std.setRoll_no(101);
        std.setEmail("ahmed@gmail.com");


        return std;

    }

    @Bean("stdObj2")
    public Student stdId2(){

        Student std = new Student();

        std.setName("osman");
        std.setRoll_no(102);
        std.setEmail("osman@gmail.com");


        return std;

    }


}
