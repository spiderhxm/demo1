package com.huxm.demo.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huxm.demo.demo1.entity.auto.User;
import com.huxm.demo.demo1.entity.rest.RestResponse;
import com.huxm.demo.demo1.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/add")
	public RestResponse addUser(@RequestParam(value="name", defaultValue = "shawn") String name,@RequestParam(value="group", defaultValue = "1") Integer group) {
		
		User user = new User();
		user.setGroupid(group);
		user.setName(name);
		userService.add(user);
		
		RestResponse rr = new RestResponse();
		rr.setReturnCode("0000");
		rr.setRetrunMsg("successful");
		rr.setContent(user.toString());
		return rr;
		
	}
	
	
	

}
