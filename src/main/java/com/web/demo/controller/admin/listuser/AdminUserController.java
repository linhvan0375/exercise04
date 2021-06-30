package com.web.demo.controller.admin.listuser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminUserController {
	@GetMapping("admin/listuser")
	public String userlist() {
		System.out.println("Admin/listuser");
		return "admin/listuser";
	}
}
