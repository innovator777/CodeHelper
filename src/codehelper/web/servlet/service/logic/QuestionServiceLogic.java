package codehelper.web.servlet.service.logic;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.store.QuestionStore;
import codehelper.web.servlet.store.logic.QuestionStoreLogic;

public class QuestionServiceLogic implements QuestionService{

	private QuestionStore questionStore;
	
	public QuestionServiceLogic() {
		questionStore = new QuestionStoreLogic();
	}
	
	@Override
	public int addQuestion(Question question) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyQuestion(Question question) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeQuestion(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Question find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findByMemeber(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
