package com.huxm.demo.demo1.dao.auto;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huxm.demo.demo1.entity.auto.Request;

@Component
public class RequestDao {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<Request> listAll() {
		//List<Request> list = sqlSession.selectList("com.huxm.demo.demo1.dao.auto.RequestMapper.selectAll", null);
		List<Request> list = sqlSession.selectList("selectAll", null);
		return list;
		
	}
	

}
