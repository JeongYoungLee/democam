package com.example.democam.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class MainController {

	// 첫 화면
	@GetMapping({"/" , ""})
	public String main() {
		System.out.println("Main Page");
		return "main.html";
	}

	@GetMapping("/home")
	public String home() {
		System.out.println("Home Page");
		return "home.html";
	}


	@GetMapping("/pay")
	public String pay() {
		System.out.println("pay Page");
		return "pay.html";
	}







}
