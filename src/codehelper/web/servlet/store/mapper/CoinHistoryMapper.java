package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryMapper {
	int create(CoinHistory history, int coinAmount);
	List<CoinHistory> retrieveByMember(String member);
}