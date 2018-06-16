package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Answer;

public interface AnswerMapper {

	int insert(Answer answer);
	void update(Answer answer);
	int delete(int id);
	List<Answer> selectByQuestion(int questionId);
	List<Answer> selectByMember(String memberId);
}
