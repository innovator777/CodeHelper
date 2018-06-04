package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Answer;

public interface AnswerStore {
	
	int create(Answer answer);
	void update(Answer answer);
	void delete(int id);
	List<Answer> retrieveByQuestion(int qid);

}
