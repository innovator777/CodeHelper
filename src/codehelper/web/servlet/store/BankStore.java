package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Bank;

public interface BankStore {
	
	int create(Bank bank);
	void delete(int id);
	List<Bank> retrieveByMember(String id);

}
