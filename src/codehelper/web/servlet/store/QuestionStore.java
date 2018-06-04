package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionStore {
	
	int create(Question question);
	void update(Question question);
	void delete(int id);
	Question retrieve(int id);
	List<Question> retrieveByMember(Member member);
	List<Question> retrieveAll();

}
