package com.xwd.springtx.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactional注解中的属性
 * 	propagation : 事务的传播行为
 *  isolation : 事务的隔离级别
 * 	readOnly : 只读
 * 	rollbackFor : 发生哪些异常回滚
 * 	noRollbackFor:发生哪些异常不回滚
 * @author yuren
 *
 */
@Transactional(propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void transfer(String out, String in, Double money) {
		accountDAO.outMoney(out, money);
		int i = 1 / 0;
		accountDAO.inMoney(in, money);
	}
}
