package codehelper.web.servlet.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.store.BankStore;
import codehelper.web.servlet.store.mapper.BankMapper;

public class BankStoreLogic implements BankStore{
	
	private CodeHelperSessionFactory factory;
	
	public BankStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public int create(Bank bank) {
		SqlSession session = factory.getSession();
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			mapper.insert(bank);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return bank.getId();
	}
	
	@Override
	public int delete(int id) {
		SqlSession session = factory.getSession();
		
		int result=0;
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			result = mapper.delete(id);		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public List<Bank> retrieveByMember(String memberId) {
		SqlSession session = factory.getSession();
		
		List<Bank> result = null;
		
		try {
			BankMapper mapper = session.getMapper(BankMapper.class);
			result = mapper.selectByMember(memberId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

}
