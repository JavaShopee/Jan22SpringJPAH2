package com.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	@Autowired
	StudRepo repo;

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		mv.addObject("Record Added");
		return mv;
		
	}
	
	@RequestMapping("/addStud")
	public String addStud(Student stud) 
	{
		repo.save(stud);
		return "home.jsp";
		
	}
	
	@RequestMapping("/showStud")
	public ModelAndView dispStud(@RequestParam int roll) 
	{
		ModelAndView mv = new ModelAndView();
		Student stud = repo.findById(roll).get();
		mv.addObject("stud", stud);
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	@RequestMapping("/showByTech")
	public ModelAndView dispStudByTech(@RequestParam String tech) 
	{
		ModelAndView mv = new ModelAndView();
		List<Student> stud = repo.findByTech(tech);
		System.out.println(stud);
		mv.addObject("stud", stud);
		mv.setViewName("display.jsp");
		return mv;
	}
	
	
	@GetMapping("studs")
	@ResponseBody
	public List<Student> getStuds() {
		return repo.findAll();
	}
	
	
	@GetMapping("studs/{roll}")
	@ResponseBody
	public Student getStud(@PathVariable int roll) {
		return repo.findById(roll).get();
	}
	
	
	@PostMapping("studs")
	public Student addMyStud(@RequestBody Student stud) {
		repo.save(stud);
		return stud;
	}
	
	
	@PutMapping("studs/{roll}")
	public Student updMyStud(@RequestBody Student stud) {
		repo.save(stud);
		return stud;
	}
	
	@DeleteMapping("studs/{roll}")
	public String addMyStud(@PathVariable int roll) {
		repo.deleteById(roll);
		return "Record Deleted";
	}
}
