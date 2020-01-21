package springdemo.mvc.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springdemo.mvc.model.Student;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{${countryOptions}}")
    private Map<String, String> countryOptions;
    @Value("#{${languages}}")
    private Map<String, String> languages;
    @Value("#{${systems}}")
    private Map<String,String> systems;

    @RequestMapping("/showForm")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("countryOptions", countryOptions);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-confirmation";
    }



}
