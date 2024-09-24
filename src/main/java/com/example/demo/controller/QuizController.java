package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/method/q")
public class QuizController {
	
	@ResponseBody
	@GetMapping
	public String getMethod() {
		
		System.out.println("조회");
		return "GET";
	}
	
	@ResponseBody
	@PostMapping
	public String postMethod() {
		
		System.out.println("등록");
		return "POST";
	}
	
	@ResponseBody
	@PutMapping
	public String putMethod() {
		
		System.out.println("수정");
		return "PUT";
	}
	
	@ResponseBody
	@DeleteMapping
	public String deleteMethod() {
		
		System.out.println("삭제");
		return "DELETE";
	}

}
