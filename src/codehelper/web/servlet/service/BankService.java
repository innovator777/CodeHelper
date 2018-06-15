package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Bank;

public interface BankService {

	int addBankInfo(Bank bank);
	int removeBankInfo(int id);
	List<Bank> findByMember(String mId);

}
