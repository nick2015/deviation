package com.zeta.deviation.compute;

import java.util.logging.Logger;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ServiceTask1 implements JavaDelegate {

	private final Logger log = Logger.getLogger(ServiceTask1.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		Thread.sleep(10000);
		log.info("variavles=" + execution.getVariables());
		execution.setVariable("task1", "I am task 1");
		log.info("I am task 1.");		
	}
}