package com.xwd.springtx.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring����ʽ�������ķ�ʽһ�Ĳ����ࣺ����TransactionProxyFactoryBean
 * @author yuren
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringDemo2 {
	/**
	 * ע������࣬��Ϊ�����������ǿ�Ĳ���
	 */
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo2() {
		accountService.transfer("xwd","lxt",200d);
	}
}