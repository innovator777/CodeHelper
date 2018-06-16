package codehelper.web.servlet.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.store.AnswerStore;
import codehelper.web.servlet.store.mapper.AnswerMapper;

public class AnswerStoreLogic implements AnswerStore{
	
	private CodeHelperSessionFactory factory;
	
	public AnswerStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public int create(Answer answer) {
		SqlSession session = factory.getSession();
		
		int result=0;
		
		try {
			AnswerMapper mapper = session.getMapper(AnswerMapper.class);
			result=mapper.insert(answer);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public void update(Answer answer) {
		SqlSession session = factory.getSession();
		
		try {
			AnswerMapper mapper = session.getMapper(AnswerMapper.class);
			mapper.update(answer);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		
	}

	@Override
	public int delete(int id) {
		SqlSession session = factory.getSession();
		
		int result=0;
		
		try {
			AnswerMapper mapper = session.getMapper(AnswerMapper.class);
			result = mapper.delete(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		
		return result;
	}
	
	@Override
	public List<Answer> retrieveByQuestion(int questionId) {
		SqlSession session = factory.getSession();
		
		List<Answer> result = null;
		
		try {
			AnswerMapper mapper = session.getMapper(AnswerMapper.class);
			result = mapper.selectByQuestion(questionId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public List<Answer> retrieveByMember(String memberId) {
		SqlSession session = factory.getSession();
		
		List<Answer> result = null;
		
		try {
			AnswerMapper mapper = session.getMapper(AnswerMapper.class);
			result = mapper.selectByMember(memberId);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}


}
