package codehelper.web.servlet.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.store.CoinHistoryStore;
import codehelper.web.servlet.store.mapper.CoinHistoryMapper;

public class CoinHistoryStoreLogic implements CoinHistoryStore{
	
	private CodeHelperSessionFactory factory;
	
	public CoinHistoryStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public int create(CoinHistory coinHistory) {
		SqlSession session = factory.getSession();
		int result = 0;
		
		try {
			CoinHistoryMapper mapper = session.getMapper(CoinHistoryMapper.class);
			result = mapper.insert(coinHistory);
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
	public List<CoinHistory> retrieveByMember(String memberId) {
		SqlSession session = factory.getSession();
		List<CoinHistory> result = null;
		
		try {
			CoinHistoryMapper mapper = session.getMapper(CoinHistoryMapper.class);
			result = mapper.retrieveByMember(memberId);
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
