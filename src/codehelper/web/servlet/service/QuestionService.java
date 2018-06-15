package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionService {

	int addQuestion(Question question);
	void modifyQuestion(Question question);
	void removeQuestion(int id);
	Question find(int id);
	List<Question> findByMemeber(Member member);
	List<Question> findAll();
	
}
