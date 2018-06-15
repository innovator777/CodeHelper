package codehelper.web.servlet.store.logic; 

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.store.QuestionStore;
import codehelper.web.servlet.store.mapper.QuestionMapper;

public class QuestionStoreLogic implements QuestionStore {
	
	CodeHelperSessionFactory factory;
	
	public QuestionStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public int create(Question question) {
		SqlSession session = factory.getSession();
		int result = 0;
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			 result = mapper.insert(question);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public void update(Question question) {
		SqlSession session = factory.getSession();
		
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			mapper.update(question);
		}
		catch (Exception e) {
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
		
		int result = 0;
		
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			result = mapper.delete(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public Question retrieve(int questionId) {
		SqlSession session = factory.getSession();
		
		Question result = null;
		
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			result = mapper.selectById(questionId);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public List<Question> retrieveByMember(Member member) {
		SqlSession session = factory.getSession();
		
		List<Question> result = null;
		
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			result = mapper.selectByMember(member.getId());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

	@Override
	public List<Question> retrieveAll() {
		SqlSession session = factory.getSession();
		
		List<Question> result = null;
		
		try {
			QuestionMapper mapper = session.getMapper(QuestionMapper.class);
			result = mapper.selectAll();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.commit();
			session.close();
		}
		return result;
	}

}
