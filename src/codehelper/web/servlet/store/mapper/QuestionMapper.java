package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionMapper {
	
	void insert(Question question);
	void update(Question question);
	void delete(int questionId);
	Question selectById(int questionId);
	List<Question> selectAll();
	List<Question> selectByMember(String memberId);
}
