package codehelper.web.servlet.service.logic;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.store.AnswerStore;
import codehelper.web.servlet.store.QuestionStore;
import codehelper.web.servlet.store.logic.AnswerStoreLogic;
import codehelper.web.servlet.store.logic.QuestionStoreLogic;

public class AnswerServiceLogic implements AnswerService{

	private AnswerStore answerStore;
	private QuestionStore questionStore;
	
	public AnswerServiceLogic() {
		answerStore = new AnswerStoreLogic();
		questionStore = new QuestionStoreLogic();
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

		int result = answerStore.delete(id);	
		return result;
		
	}

	@Override
	public List<Answer> findByQuestion(int qid) {
		List<Answer> foundAnswers = answerStore.retrieveByQuestion(qid);
		if(foundAnswers == null) {
			return null;
		}
		return foundAnswers;
	}

	@Override
	public boolean choose(int qid, int aid) {
		Answer answer = answerStore.retrieveById(aid);
		if(answer == null) {
			return false;
		}
		answer.setIsChoose(qid);
		answerStore.update(answer);
		
		return true;
	}

	@Override
	public int liked(int aId) {
		
		int result = 0;
		
		Answer answer = answerStore.retrieveById(aId);
		if(answer == null) {
			return result;
		}
		answer.setLikeCount(answer.getLikeCount() + 1);
		answerStore.update(answer);
		result = 1;
		return result;
	}

	@Override
	public List<Answer> findByMember(String mid) {
		
		List<Answer> answers = answerStore.retrieveByMember(mid);
		return answers;
	}

	@Override
	public Answer findById(int aid) {
		Answer answer = answerStore.retrieveById(aid);
		if(answer == null) {
			return null;
		}
		return answer;
	}

}
