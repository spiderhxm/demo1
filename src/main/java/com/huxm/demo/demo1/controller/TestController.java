/*package com.huxm.demo.demo1.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huxm.demo.demo1.entity.rest.RestResponse;
import com.huxm.demo.demo3.service.DateService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	DateService dateService;
	
	@RequestMapping(path="/post1",method = RequestMethod.POST)		
	public @ResponseBody RestResponse post(@CookieValue(value="c1") String c1, @RequestBody Map<String, Object> map) {
		RestResponse rr = new RestResponse();
		rr.setReturnCode("0000");		
		//rr.setContent("cookie="+c1 + " " + "body="+ map);
		Date date = dateService.getDate();
		rr.setContent("date :"+ date.toString());
		
		return rr;
		
	}

}*/
