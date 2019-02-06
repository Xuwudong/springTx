package com.xwd.springtx.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring声明式事务管理的方式二：基于AspectJ的XML方式的配置
 * @author yuren
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test
	public void demo2() {
		accountService.transfer("xwd","lxt",200d);
	}
}