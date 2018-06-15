package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryMapper {
	int insert(CoinHistory coinHistory);
	List<CoinHistory> selectByMember(String memberId);
}
