package codehelper.web.servlet.store.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.CoinHistoryType;
import codehelper.web.servlet.domain.Member;

public class CoinHistoryStoreLogicTest {
	
	private CoinHistoryStoreLogic coinStore;
	private MemberStoreLogic memberStore;
	
	@Before
	public void CoinHistoryStoreLogic() {
		coinStore = new CoinHistoryStoreLogic();
		memberStore = new MemberStoreLogic();
	}

	@Test
	public void testCreate() {
//		CoinHistory coinHistory = new CoinHistory();
//		coinHistory.setMemberId("a@bu.ac.kr");
//		coinHistory.setAmount(10000);
//		coinHistory.setBalance(10000);
//		coinHistory.setType(CoinHistoryType.CHARGE);
//		coinStore.create(coinHistory);
//		Member member = memberStore.retrieve("a@bu.ac.kr");
//		member.setBalance(member.getBalance() + 10000);
//		memberStore.update(member);
	}

	@Test
	public void testRetrieveByMember() {
//		assertEquals(CoinHistoryType.CHARGE, coinStore.retrieveByMember("a@bu.ac.kr").get(0).getType());
	}

}
