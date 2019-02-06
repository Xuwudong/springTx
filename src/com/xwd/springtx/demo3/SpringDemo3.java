package com.xwd.springtx.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring����ʽ�������ķ�ʽ��������AspectJ��XML��ʽ������
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