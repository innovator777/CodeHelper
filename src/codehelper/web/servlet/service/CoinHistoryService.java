package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryService {

	int charge(CoinHistory coinHistory, int coinAmount);
	int exchange(CoinHistory coinHistory, int coinAmount);
	List<CoinHistory> findByMember(String id);

}
