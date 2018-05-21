package com.huxm.demo.demo1.controller;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huxm.demo.demo1.dao.auto.RequestMapper;
import com.huxm.demo.demo1.dao.auto.UserMapper;
import com.huxm.demo.demo1.entity.auto.Request;
import com.huxm.demo.demo1.entity.auto.User;
import com.huxm.demo.demo1.entity.rest.RestResponse;
import com.huxm.demo.demo1.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	RequestService requestService;
	
	@ResponseBody
	@RequestMapping("/add")
	public RestResponse addRequest(@RequestParam(value="userId") Integer userId) {
		Logger log = Logger.getLogger(getClass());
		
		RestResponse rr = new RestResponse();
		rr.setReturnCode("0000");	
		
	
		Integer reqId;
		try {
			reqId = requestService.add(userId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rr.setReturnCode("0099");
			rr.setRetrunMsg(e.toString());
			return rr;
			
		}
		
		rr.setContent("request id is "+reqId.toString());

		log.info("a new request added");
		
		
		return rr;
		
	}

}
