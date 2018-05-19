package com.huxm.demo.demo1.config;

import javax.sql.DataSource;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class AppConfig {
	@Autowired
	private DataSource dataSource;	

	@Bean
	public ProcessEngine processEngine() throws Exception {
		SpringProcessEngineConfiguration spec = new SpringProcessEngineConfiguration();
		spec.setTransactionManager(transactionManager());
		spec.setDataSource(dataSource);		
		spec.setDatabaseSchemaUpdate("true");
		
		ProcessEngineFactoryBean pefb = new ProcessEngineFactoryBean();
		pefb.setProcessEngineConfiguration(spec);
		ProcessEngine engine = pefb.getObject();		
		return engine;
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource);
		
	}
	
	@Bean
	public RepositoryService repositoryService() throws Exception {
		return processEngine().getRepositoryService();
		
	}
	
	@Bean
	public RuntimeService runtimeService() throws Exception {
		return processEngine().getRuntimeService();
	}
}
