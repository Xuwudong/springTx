package com.xwd.springtx.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactionalע���е�����
 * 	propagation : ����Ĵ�����Ϊ
 *  isolation : ����ĸ��뼶��
 * 	readOnly : ֻ��
 * 	rollbackFor : ������Щ�쳣�ع�
 * 	noRollbackFor:������Щ�쳣���ع�
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
