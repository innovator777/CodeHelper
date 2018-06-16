package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryService {

	int charge(CoinHistory coinHistory);
	int exchange(CoinHistory coinHistory);
	List<CoinHistory> findByMember(String id);

}
