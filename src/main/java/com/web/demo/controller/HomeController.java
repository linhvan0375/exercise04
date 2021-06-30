package com.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "admin/New_game_categories";
	}
	@GetMapping("/shop")
	public String game() {
		return "shop/checkout-1";
	}
}
