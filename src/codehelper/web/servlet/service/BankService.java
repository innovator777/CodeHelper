package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Bank;

public interface BankService {
	
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int addBankInfo(Bank bank);
	
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	void removeBankInfo(int id);
	
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<Bank> findByMember(String id);

}
