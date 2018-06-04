package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryStore {
	
	int create(CoinHistory coinHistory, int coinAmount);
	List<CoinHistory> retrieveByMember(String id);
}
