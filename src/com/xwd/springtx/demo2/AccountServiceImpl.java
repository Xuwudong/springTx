package com.xwd.springtx.demo2;

public class AccountServiceImpl implements AccountService {

	private AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public void transfer(String out, String in, Double money) {
		accountDAO.outMoney(out, money);
//		int i = 1 / 0;
		accountDAO.inMoney(in, money);
	}
}
