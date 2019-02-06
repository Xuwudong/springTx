package com.xwd.springtx.demo2;

public interface AccountDAO {
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);
}
