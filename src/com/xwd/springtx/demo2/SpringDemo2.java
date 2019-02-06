package com.xwd.springtx.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring声明式事务管理的方式一的测试类：基于TransactionProxyFactoryBean
 * @author yuren
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
	/**
	 * 注入代理类，因为代理类进行增强的操作
	 */
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo2() {
		accountService.transfer("xwd","lxt",200d);
	}
}