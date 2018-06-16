package codehelper.web.servlet.store.logic;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.store.QuestionStore;

public class QuestionStoreLogicTest {
	
	QuestionStore store;
	
	@Before
	public void QuestionStoreLogic() {
		store = new QuestionStoreLogic();
	}

	@Test
	public void testCreate() {
//		Question question = new Question();
//		question.setTitle("질문 타이틀");
//		question.setContents("질문 내용");
//		Date today = new Date(Calendar.getInstance().getTimeInMillis());
//		question.setCreatedDate(today);
//		question.setMemberId("aaa@bu.ac.kr");
//		assertEquals(1, store.create(question));
	}

	@Test
	public void testUpdate() {
//		Question question = new Question();
//		question.setId(4);
//		question.setTitle("질문 타이틀");
//		question.setContents("질문 내용");
//		Date today = new Date(Calendar.getInstance().getTimeInMillis());
//		question.setCreatedDate(today);
//		question.setMemberId("aaa@bu.ac.kr");
//		question.setReadCount(2);
//		store.update(question);	
	}

	@Test
	public void testDelete() {
//		assertEquals(1, store.delete(2));
	}

	@Test
	public void testRetrieve() {
//		assertNotNull(store.retrieve(1));
//		assertEquals(1, store.retrieve(1).getId());
	}

	@Test
	public void testRetrieveByMember() {
//		Member member = new Member();
//		member.setId("aaa@bu.ac.kr");
//		List<Question> list = store.retrieveByMember(member);
//		assertEquals(5, list.get(0).getId());
	}

	@Test
	public void testRetrieveAll() {
//		List<Question> list = store.retrieveAll();
//		assertEquals(3, list.size());
	}
}
