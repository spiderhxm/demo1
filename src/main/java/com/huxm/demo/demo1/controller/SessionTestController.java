package com.huxm.demo.demo1.controller;

import java.util.Enumeration;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.huxm.demo.demo1.entity.auto.User;
import com.huxm.demo.demo1.entity.rest.RestResponse;

@Controller
@RequestMapping("/session")
@SessionAttributes({"sessAtr1","sessAtr2"})
public class SessionTestController {
	
	@RequestMapping("/addAtr")
	@ResponseBody
	public RestResponse addAtr(Model model, HttpSession httpSession, @RequestBody()User user) {
		RestResponse rr = new RestResponse();
		
		//System.out.println("sessAtr1="+sessAtr1);
		
		System.out.println("user.name="+user.getName());
		
		model.addAttribute("sessAtr2", "sa2");
		
		Map<String, Object> mm = model.asMap();
		
		for(String mkey:mm.keySet()) {
			System.out.println("model: " + mkey +" "+ mm.get(mkey));
		}
		
		
		Enumeration sas = httpSession.getAttributeNames();
		
		while(sas.hasMoreElements()) {
			String san = sas.nextElement().toString();
			System.out.println("session: " + san + " " +httpSession.getAttribute(san));
		}
		
		rr.setContent("finish add");
		
		return rr;
		
	}
	
	@RequestMapping("/viewAtr")
	@ResponseBody
	public RestResponse viewAtr(Model model, HttpSession httpSession) {
		RestResponse rr = new RestResponse();
		
		Map<String, Object> mm = model.asMap();
		
		for(String mkey:mm.keySet()) {
			System.out.println("model: " + mkey +" "+ mm.get(mkey));
		}
		
		
		Enumeration sas = httpSession.getAttributeNames();
		
		while(sas.hasMoreElements()) {
			String san = sas.nextElement().toString();
			System.out.println("session: " + san + " " +httpSession.getAttribute(san));
		}
		
		rr.setContent("finish view");
		
		return rr;
		
	}
	
	

	
	
}
