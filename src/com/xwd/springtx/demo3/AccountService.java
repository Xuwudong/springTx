package com.xwd.springtx.demo3;

public interface AccountService {
	/**
	 * 
	 * @param out
	 * @param in
	 * @param money
	 */
	public void transfer(String out,String in,Double money);
}
