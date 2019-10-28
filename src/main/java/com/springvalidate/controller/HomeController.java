package com.springvalidate.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springvalidate.model.Student;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("student", new Student());
		return "home";
	}

	@RequestMapping("/student")
	public String getStudent(Model model, @Valid @ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("student", student);
			return "home";
		} else {
			System.out.println(student.toString());
			return "home";
		}
	}
}
