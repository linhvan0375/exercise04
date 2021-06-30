package com.web.demo.controller.admin.listuser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.demo.entity.Users;
import com.web.demo.service.admin.listuser.AdminUserService;

@RestController
public class RestUserController {
	
	@Autowired
	AdminUserService userService;
	
	@GetMapping("/api/user")
	public ResponseEntity<?> getListuser(){
		System.out.println("/api/user");
		List<Users> list=userService.findAll();
		return ResponseEntity.ok(list);
	}
	@PostMapping("/api/adduser")
	public  ResponseEntity<Users> adduser(@RequestBody Users users){
		Users us= userService.save(users);
		return new ResponseEntity<Users>(us,HttpStatus.OK);
		
	}
	@DeleteMapping("/api/delete/{id}")
	public void delete(@PathVariable Integer id){
			 userService.deleteById(id);
		
		
	}
}
