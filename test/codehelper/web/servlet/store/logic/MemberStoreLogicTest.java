package codehelper.web.servlet.store.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.store.MemberStore;

public class MemberStoreLogicTest {
	
	MemberStore memberStore;
	
	@Before
	public void testMemberStoreLogic() {
		memberStore = new MemberStoreLogic();
	}

	@Test
	public void testCreate() {
//		Member member = new Member();
//		member.setId("a@bu.ac.kr");
//		member.setPassword("123");
//		member.setName("세글자");
//		String id = memberStore.create(member);
//		assertEquals("a@bu.ac.kr", member.getId());
	}

	@Test
	public void testUpdate() {
//		Member member = memberStore.retrieve("a@bu.ac.kr");
//		member.setName("네글자");
//		memberStore.update(member);
//		assertEquals("네글자", memberStore.retrieve("a@bu.ac.kr").getName());
	}

	@Test
	public void testDelete() {
//		memberStore.delete("a@bu.ac.kr");
//		assertNull(memberStore.retrieve("a@bu.ac.kr"));
	}

	@Test
	public void testRetrieve() {
//		Member member = memberStore.retrieve("a@bu.ac.kr");
//		assertNotNull(member);
	}

}
