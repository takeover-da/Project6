package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/board")  //공통 URL
@Controller
public class MappingController2 {

	
	// 게시물 조회
	@ResponseBody
	@GetMapping
	public String list() {
		
		System.out.println("게시물 조회..");
		return "GET";
	}
	
	
	// 게시물 등록
	@ResponseBody
	@PostMapping
	public String save() {
		
		System.out.println("게시물 등록..");
		return "POST";
	}
	
	
	// 게시물 수정
	@ResponseBody
	@PutMapping
	public String modify() {
		
		System.out.println("게시물 수정..");
		return "PUT";
	}

	
	// 게시물 삭제
	@ResponseBody
	@DeleteMapping
	public String remove() {
		
		System.out.println("게시물 삭제..");
		return "DELETE";
	}
	
	
	
	
}
