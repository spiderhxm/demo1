package com.huxm.demo.demo1.biz;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class UpdateStatusSuccess implements JavaDelegate {

	
	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		// TODO Auto-generated method stub
		
		String bizKey = arg0.getProcessBusinessKey();
		
		
		
		
	}

}
