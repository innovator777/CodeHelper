package codehelper.web.servlet.service.logic;

import java.util.List;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.service.BankService;
import codehelper.web.servlet.store.BankStore;
import codehelper.web.servlet.store.logic.BankStoreLogic;

public class BankServiceLogic implements BankService{

	private BankStore bankStore;
	
	public BankServiceLogic() {
		bankStore = new BankStoreLogic();
	}
	
	@Override
	public int addBankInfo(Bank bank) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeBankInfo(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Bank> findByMember(String mId) {
		// TODO Auto-generated method stub
		return null;
	}

}
