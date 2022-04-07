package net.codejava;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class controller {

    private StudentService service;

    @RequestMapping("/")
    public String veiwHomePage(Model model){

        List<Student> listStudents= service.listAll();
        model.addAttribute(attributeName:"listStudents", listStudents);
        return "index";
    }

    public String showHomePage(Model model){

        Student student = new Student();
    }
}
