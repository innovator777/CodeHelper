package codehelper.web.servlet.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.store.QuestionStore;

public class QuestionStoreLogic implements QuestionStore {
	
	CodeHelperSessionFactory factory;
	
	public QuestionStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public int create(Question question) {
		SqlSession session = factory.getSession();
		
		try {
			
		}
		catch (Exception e) {
			
		}
		finally {
			
		}
		return 0;
	}

	@Override
	public void update(Question question) {
		
	}

	@Override
	public void delete(int id) {
		
	}

	@Override
	public Question retrieve(int id) {
		return null;
	}

	@Override
	public List<Question> retrieveByMember(Member member) {
		return null;
	}

	@Override
	public List<Question> retrieveAll() {
		return null;
	}

}
