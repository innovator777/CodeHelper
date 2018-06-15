package codehelper.web.servlet.service.logic;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.store.CoinHistoryStore;

public class CoinHistoryServiceLogic implements CoinHistoryService{

	private CoinHistoryStore coinHistoryStore;
	
	public CoinHistoryServiceLogic() {
		
	}
	
	@Override
	public int charge(CoinHistory coinHistory, int coinAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int exchange(CoinHistory coinHistory, int coinAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<CoinHistory> findByMember(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
