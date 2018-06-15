package codehelper.web.servlet.service.logic;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.store.AnswerStore;
import codehelper.web.servlet.store.logic.AnswerStoreLogic;

public class AnswerServiceLogic implements AnswerService{

	private AnswerStore answerStore;
	
	public AnswerServiceLogic() {
		answerStore = new AnswerStoreLogic();
	}
	
	@Override
	public int addAnswer(Answer answer) {
		
		int result=0;
		
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		answer.setCreatedDate(today);
		answer.setLikeCount(0);
		answer.setIsChoose(0);
		result = answerStore.create(answer);
		return result;
	}

	@Override
	public void modifyAnswer(Answer answer) {
		
		answerStore.update(answer);
		
	}

	@Override
	public int removeAnswer(int id) {

		int result=0;
		
		result = answerStore.delete(id);	
		return result;
	}

	@Override
	public List<Answer> findByQuestion(int qid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean choose(int qid, int aid) {
		
		return false;
	}

	@Override
	public int liked(int id) {
		
		int result=0;
		
		Answer answer = new Answer();
		answer.setId(id);		
		return result;
	}

}
