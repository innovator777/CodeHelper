package codehelper.web.servlet.store.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.store.BankStore;

public class BankStoreLogicTest {

	BankStore bankStore;
	
	@Before
	public void testBankStoreLogic() {
		bankStore = new  BankStoreLogic();
	}
	
//	@Test
//	public void testCreate() {
//		Bank bank = new Bank();	
//		bank.setName("국민은행");
//		bank.setAccountNumber("111-1");
//		bank.setAccountHolder("고용석");
//		bank.setmId("koys");
//		bankStore.create(bank);
//	}

//	@Test
//	public void testDelete() {
//		assertEquals(1, bankStore.delete(1));
//	}

	@Test
	public void testRetrieveByMember() {
		assertEquals(1,bankStore.retrieveByMember("koys").size());
	}

}
