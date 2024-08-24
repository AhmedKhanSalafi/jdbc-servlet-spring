package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public Address createAddObj() {

        Address addr = new Address();
        addr.setHouse_no(177);
        addr.setCity("Hyderabad");
        addr.setPincode(500038);

        return addr;
    }
    @Bean
    public Address createAddObj2() {

        Address addr2 = new Address();
        addr2.setHouse_no(166);
        addr2.setCity("Banglore");
        addr2.setPincode(500668);

        return addr2;
    }

    @Bean
    public Subject createSubObj() {

        Subject subj=new Subject();

        List<String> subjectList = new ArrayList<>();
        subjectList.add("Java");
        subjectList.add("Python");
        subjectList.add("C++");
subj.setSubject(subjectList);
        return  subj;

    }
    @Bean
    public Student createStdObj() {

        Student std = new Student();
        std.setRoll_no(101);
        std.setName("ahmed");
        //std.setAddress(createAddObj()); //manually DI
        return std;
    }
}