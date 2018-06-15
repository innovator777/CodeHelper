package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Answer;

public interface AnswerService {

	int addAnswer(Answer answer);
	void modifyAnswer(Answer answer);
	int removeAnswer(int id);
	List<Answer> findByQuestion(int qid);
	boolean choose(int qid, int aid);
	int liked(int id);
	
}
