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
		int result = 0;
		result = bankStore.create(bank);
		return result;
	}

	@Override
	public int removeBankInfo(int id) {
		int result = 0;
		result = bankStore.delete(id);
		return result;
	}

	@Override
	public List<Bank> findByMember(String memberId) {
		List<Bank> result = null;
		result=bankStore.retrieveByMember(memberId);
		return result;
	}

}
