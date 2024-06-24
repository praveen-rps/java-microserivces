package com.examples.spring.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	
	@PostMapping("/post")
	public ModelAndView posts() {
		return new ModelAndView("post","data","Get Mapping in test1 method is called");
	}
	
	@GetMapping("/test1")
	public ModelAndView test1() {
		return new ModelAndView("home1","data","Get Mapping in test1 method is called");
	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		
		model.addAttribute("name","Kumar");
		model.addAttribute("age",25);
		model.addAttribute("city","Bangalore");
		return "home2";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		List<Employee> employees = new ArrayList<>();
		List<Department> depts = new ArrayList<>();
		employees.add(new Employee(101,"Kumar","Finance"));
		employees.add(new Employee(102,"Raj","Quality"));
		employees.add(new Employee(103,"Babu","IT"));
		employees.add(new Employee(104,"Anil","HR"));
		
		depts.add(new Department(201,"Finance","Bangalore"));
		depts.add(new Department(202,"Quality","Hyderabad"));
		depts.add(new Department(203,"IT","Chennai"));
		depts.add(new Department(204,"HR","Mumbai"));
		
		model.addAttribute("data", employees);
		model.addAttribute("depts", depts);
		
		
		return "home3";
	}
	
	

}
