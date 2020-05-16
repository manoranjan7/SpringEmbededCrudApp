package com.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.models.User;
import com.student.services.FlipcartServices;

@RestController
@RequestMapping("/order")
public class FlipcartController {
	
	@Autowired
	FlipcartServices flipService;
	
	@GetMapping("/hello")
	public String sampleURL()
	{
		return "Hello";
	}
	
	@PostMapping("/neworder")
	public String receivingOrder(@RequestBody User user)
	{
		flipService.receivingOrder(user);
		
		return "Data successfully posted";
	}
	
	@GetMapping("/getuserbyname/{name}")
	public List<User> getUserByName(@PathVariable String name)
	{
		return flipService.getUserByName(name);
	}
	
	

}
