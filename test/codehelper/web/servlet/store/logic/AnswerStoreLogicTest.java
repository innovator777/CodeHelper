package codehelper.web.servlet.store.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.store.AnswerStore;

public class AnswerStoreLogicTest {
	
	AnswerStore answerStore;
	
	@Before
	public void testAnswerStoreLogic() {
		answerStore = new AnswerStoreLogic();
	}

//	@Test
//	public void testCreate() {
//		Answer answer = new Answer();
//		Date today = new Date(Calendar.getInstance().getTimeInMillis());
//		answer.setContents("adsf");
//		answer.setLikeCount(1);
//		answer.setIsChoose(1);
//		answer.setCreatedDate(today);
//		answer.setMemberId("koys");
//		answer.setQuestionId(1);
//		answerStore.create(answer);
//	}

//	@Test
//	public void testUpdate() {
//		Answer answer = new Answer();
//		Date today = new Date(Calendar.getInstance().getTimeInMillis());
//		answer.setId(1);
//		answer.setContents("adfasdf");
//		answer.setLikeCount(3);
//		answer.setIsChoose(0);
//		answer.setDate(today);
//		answerStore.update(answer);
//	}
	
//	@Test
//	public void testDelete() {
//		assertEquals(1, answerStore.delete(1));
//	}
//
//	@Test
//	public void testRetrieveByQuestion() {
//		assertEquals(1, answerStore.retrieveByQuestion(1).size());
//	}
	
//	@Test
//	public void testRetrieveByMember() {
//		assertEquals(1, answerStore.retrieveByMember("koys").size());
//	}
	
//	@Test
//	public void testRetrieveById() {
//		assertNotNull(answerStore.retrieveById(1));
//		assertEquals(1, answerStore.retrieveById(1).getLikeCount());
//	}

}
