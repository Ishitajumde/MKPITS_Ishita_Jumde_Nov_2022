package com.mkpits.project.Student.controller;

import com.mkpits.project.Student.dtoRequest.StudentDto;
import com.mkpits.project.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudController {
   @Autowired
    public StudentService studentService;
    @GetMapping("/studentDetails")
    public String getDetails(Model model) {
        List<StudentDto> studentDtoList = studentService.getData();
        model.addAttribute("studentDetails", studentDtoList);
        return "studentDetails";
    }

    @GetMapping("/studentForm")
    public String studentForm(Model model){
        StudentDto studentDto = new StudentDto();
        model.addAttribute("student",studentDto);
        return "studentForm";
    }

    @PostMapping("/addStudData")
    public String studData(@ModelAttribute ("addData") StudentDto studentDto){
        studentService.addData(studentDto);
        return "redirect:/studentDetails";
    }
   
}
