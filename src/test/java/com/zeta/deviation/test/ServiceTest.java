package com.zeta.deviation.test;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.IdentityService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.test.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thinkgem.jeesite.modules.act.utils.ActUtils;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-context.xml","classpath*:spring-context-activiti.xml" })

public class ServiceTest {

	private String deploymentId;
	@Resource
	private ProcessEngine processEngine;
	@Resource
	protected RepositoryService repositoryService;
	@Resource
	protected RuntimeService runtimeService;
	@Resource
	protected TaskService taskService;
	@Resource
	protected FormService formService;
	@Resource
	protected HistoryService historyService;
	@Resource
	protected IdentityService identityService;
	@Resource
	protected ManagementService managementService;
	
	@Test
	public void testServiceTask() {
		ProcessInstance pi = runtimeService.startProcessInstanceByKey("process", "serviceTask");
		assertEquals(true, pi.isEnded());
	}
}