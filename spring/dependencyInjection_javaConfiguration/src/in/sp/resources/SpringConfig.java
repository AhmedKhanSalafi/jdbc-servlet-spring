package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Address createAddObj(){

        Address addr= new Address();
        addr.setHouse_no(177);
        addr.setCity("Hyderabad");
        addr.setPincode(500038);

        return addr;
    }
    @Bean
    public Student createStdObj(){

        Student std = new Student();
        std.setRoll_no(101);
        std.setName("ahmed");
        std.setAddress(createAddObj());
        return std;
    }


}
