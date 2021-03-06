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
		return questionStore.create(question);
	}

	@Override
	public void modifyQuestion(Question question) {
		questionStore.update(question);
	}

	@Override
	public void removeQuestion(int id) {
		questionStore.delete(id);
	}

	@Override
	public Question find(int id) {
		return questionStore.retrieve(id);
	}

	@Override
	public List<Question> findByMemeber(Member member) {
		return questionStore.retrieveByMember(member);
	}

	@Override
	public List<Question> findAll() {
		return questionStore.retrieveAll();
	}

	@Override
	public boolean choose(int qid, int aid) {
		Question question = questionStore.retrieve(qid);
		if(question == null) {
			return false;
		}
		question.setIsChoose(aid);
		questionStore.update(question);
		return true;
	}

	@Override
	public List<Question> findByTitle(String title) {
		return questionStore.retrieveByTitle(title);
	}

	@Override
	public List<Question> findByContents(String contents) {
		return questionStore.retrieveByContents(contents);
	}

}
