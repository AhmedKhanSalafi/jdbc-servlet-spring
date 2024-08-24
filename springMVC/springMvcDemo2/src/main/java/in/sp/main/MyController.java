package in.sp.main;

import in.sp.beans.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/helloPage")
    public ModelAndView openHelloPage() {

        System.out.println("open hello page () method excuted");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");

        return mav;

    }

    @GetMapping("/home")
    public String openhome() {

        return "home";
    }

    @GetMapping("/my-form")
    public String openform() {

        return "myform";

    }

    @PostMapping("/submitform")
    public String handleMyForm(@ModelAttribute User user){

        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPhoneNo());

        return "profile";

    }
}