package springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView mainMenu() {
        ModelAndView modelAndView = new ModelAndView("main-menu");
        modelAndView.addObject("title","Home Page");
        modelAndView.addObject("end","Witajcie w mojej kuchni!");
        return modelAndView;
    }
}
