package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionMapper {
	
	int insert(Question question);
	void update(Question question);
	int delete(int questionId);
	Question selectById(int questionId);
	List<Question> selectAll();
	List<Question> selectByMember(String memberId);
	List<Question> selectByTitle(String title);
	List<Question> selectByContents(String contents);
}