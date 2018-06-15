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
	int removeBankInfo(int id);
	
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<Bank> findByMember(String mId);

}
