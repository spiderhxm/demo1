package com.huxm.demo.demo1.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.activiti.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huxm.demo.demo1.entity.rest.RestResponse;

@Controller
@RequestMapping("/activiti")
public class ActivitiController {
	@Autowired
	RepositoryService repositoryService;

	@ResponseBody
	@RequestMapping("/deploy")
	public RestResponse deploy(@RequestParam(value = "bpmn") String bpmn) {

		RestResponse rr = new RestResponse();
		rr.setContent("");
		rr.setReturnCode("0000");
		rr.setRetrunMsg("Deployed Succesfully");

		if (bpmn == null || "".equals(bpmn)) {
			rr.setRetrunMsg("0090");
			rr.setRetrunMsg("empty bpmn");
			return rr;
		}

		repositoryService.createDeployment().addClasspathResource("activiti-workflow/" + bpmn).deploy();

		rr.setContent("bmpn number = " + repositoryService.createDeploymentQuery().count());

		return rr;
	}

}
