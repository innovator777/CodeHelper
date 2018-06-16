package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Bank;

public interface BankMapper {
	
	int insert(Bank bank);
	int delete(int id);
	List<Bank> selectByMember(String memberId);

}
