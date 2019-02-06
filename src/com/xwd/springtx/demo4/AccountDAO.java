package com.xwd.springtx.demo4;

public interface AccountDAO {
	public void outMoney(String out,Double money);
	
	public void inMoney(String in,Double money);
}
