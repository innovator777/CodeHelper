package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Bank;

public interface BankStore {
	
	int create(Bank bank);
	int delete(int id);
	List<Bank> retrieveByMember(String memberId);

}
