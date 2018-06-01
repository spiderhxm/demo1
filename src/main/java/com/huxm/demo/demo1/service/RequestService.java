package com.huxm.demo.demo1.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huxm.demo.demo1.dao.auto.RequestDAO;
import com.huxm.demo.demo1.dao.auto.RequestMapper;
import com.huxm.demo.demo1.dao.auto.UserMapper;
import com.huxm.demo.demo1.entity.auto.Request;
import com.huxm.demo.demo1.entity.auto.User;

@Service
public class RequestService {
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	RequestMapper requestMapper;
	
	@Autowired
	RequestDAO requestDao;
	
	@Autowired
	RuntimeService runtimeService;
	
	public Integer add(Integer userId) throws Exception  {
		
		if (userId == null) {
			throw new Exception("not found user");
		}
		User user = userMapper.selectByPrimaryKey(userId);
		
		Request req = new Request();
		req.setCreatorid(userId);
		
		requestMapper.insert(req);
		
		Integer reqId = req.getId();
		
		
		Map<String, Object> vars = new HashMap<String, Object>();
		vars.put("requestId", reqId);
		vars.put("creatorName", user.getName());
		vars.put("creatorId", user.getId());
		runtimeService.startProcessInstanceByKey("request_process", reqId.toString(), vars);
		
		return reqId;
		
	}
	
	public Request getById(Integer id) throws Exception {
		
		if (id == null) {
			throw new Exception("is is null");
		}
		
		Request req = requestMapper.selectByPrimaryKey(id);
		
		return req;
		
		
	}
	
	public void save(Request req) {
		requestMapper.updateByPrimaryKey(req);
		
	}
	
	public List<Request> listAll(){
		return requestDao.listAll();
	}
	

}
