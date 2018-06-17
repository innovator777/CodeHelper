package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionStore {
	
	int create(Question question);
	void update(Question question);
	int delete(int id);
	Question retrieve(int id);
	List<Question> retrieveByMember(Member member);
	List<Question> retrieveAll();
	List<Question> retrieveByTitle(String title);
	List<Question> retrieveByContents(String contents);

}
