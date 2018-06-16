package codehelper.web.servlet.service.logic;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.store.CoinHistoryStore;
import codehelper.web.servlet.store.MemberStore;
import codehelper.web.servlet.store.logic.CoinHistoryStoreLogic;
import codehelper.web.servlet.store.logic.MemberStoreLogic;

public class CoinHistoryServiceLogic implements CoinHistoryService{

	private CoinHistoryStore coinHistoryStore;
	private MemberStore memberStore;
	
	public CoinHistoryServiceLogic() {
		coinHistoryStore = new CoinHistoryStoreLogic();
		memberStore = new MemberStoreLogic();
	}
	
	@Override
	public int charge(CoinHistory coinHistory) {
		int result = coinHistoryStore.create(coinHistory);
		if(result == 1) {
			Member member = memberStore.retrieve(coinHistory.getMemberId());
			member.setBalance(member.getBalance() + coinHistory.getAmount());
			memberStore.update(member);
		}
		return result;
	}

	@Override
	public int exchange(CoinHistory coinHistory) {
		int result = coinHistoryStore.create(coinHistory);
		if(result == 1) {
			Member member = memberStore.retrieve(coinHistory.getMemberId());
			member.setBalance(member.getBalance() - coinHistory.getAmount());
			memberStore.update(member);
		}
		return result;
	}

	@Override
	public List<CoinHistory> findByMember(String id) {
		return coinHistoryStore.retrieveByMember(id);
	}
	
}
