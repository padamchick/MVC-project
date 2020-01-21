package springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String getStudentName(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Siemaaaaa! " + theName;
        model.addAttribute("stName", result);
        return "helloworld";
    }

    /*
    @RequestParam("studentName") String theName zamiast HttpServletRequest request, String theName = request.getParameter("studentName");
     */
    @RequestMapping("/processFormVersionThree")
    public String getStudentName2(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "V3! " + theName;
        model.addAttribute("stName", result);
        return "helloworld";
    }
    @RequestMapping("/redirectThis")
    public ModelAndView letsGoToSilly() {
        return new ModelAndView("redirect:/silly/showForm");
    }
}

