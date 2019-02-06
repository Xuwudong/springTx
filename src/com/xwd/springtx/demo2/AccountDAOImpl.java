package com.xwd.springtx.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	@Override
	public void outMoney(String out, Double money) {
		String sql = "update account set money=money + ? where name = ?";
		this.getJdbcTemplate().update(sql, money,out);
	}

	@Override
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money - ? where name = ?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
