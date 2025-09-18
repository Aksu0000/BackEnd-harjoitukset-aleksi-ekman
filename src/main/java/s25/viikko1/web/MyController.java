package s25.viikko1.web;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.GetMapping;



@Controller

public class MyController {

    @RequestMapping("/index")
    @ResponseBody

    public String returnMessageIndex () {
        return "This is the main page";
    }

    @RequestMapping("/contact")
    @ResponseBody

    public String returnMessageContact () {
        return "This is the contact page";
    }
    
    /* @RequestMapping("/hello")
    @ResponseBody

    public String returnLocationAndName (
        @RequestParam String location,
        @RequestParam String name) {
        return "Welcome to the " + location + " " + name + "!";
    } */

    /* @GetMapping("/hello")
    public String sayHello(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("nimi", name);
        model.addAttribute("ika", age);
        return "hello";
    } */
    

}
