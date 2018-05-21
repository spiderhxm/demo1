package com.huxm.demo.demo1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huxm.demo.demo1.entity.auto.Request;
import com.huxm.demo.demo1.entity.rest.RestResponse;
import com.huxm.demo.demo1.service.RequestService;

@Controller
@RequestMapping("/task")
public class TaskController {
	@Autowired
	TaskService taskService;
	
	@Autowired
	RuntimeService runtimeService;
	
	@Autowired
	RequestService requestService;
	
	@ResponseBody
	@RequestMapping("/listOfGroup")
	public RestResponse listOfGroup(@RequestParam(value="group", defaultValue="2") String group){
		RestResponse rr = new RestResponse();
		rr.setReturnCode("0000");		
		
		List<Task> taskList = taskService.createTaskQuery().taskCandidateGroup(group).list();
		
		rr.setRetrunMsg("get task list successfully");
		rr.setContent(taskList.toString());
		
		return rr;
		
	}
	
	@ResponseBody
	@RequestMapping("/completeById")
	public RestResponse completeById(@RequestParam(value="taskId") String taskId,@RequestParam(value="userId") String userId,@RequestParam(value="status") String status){
		RestResponse rr = new RestResponse();
		rr.setReturnCode("0000");	
		
		Task task = taskService.createTaskQuery().taskId(taskId).list().get(0);
		
		String reqId  = runtimeService.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).list().get(0).getBusinessKey();
		
		//Integer reqId = (Integer) task.getProcessVariables().get("requestId");
		
		Request req;
		try {
			req = requestService.getById(Integer.valueOf(reqId));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rr.setReturnCode("0098");	
			return rr;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rr.setReturnCode("0099");	
			return rr;
		}
		
		req.setStatus(status);
		req.setReviewerid(Integer.valueOf(userId));
		
		Map<String, Object> tVars = new HashMap<String, Object>();
		tVars.put("status", status);
		tVars.put("creatorId", req.getCreatorid());
		
		taskService.complete(taskId, tVars);
		
		requestService.save(req);		
		
		return rr;
		
	}
	

}
