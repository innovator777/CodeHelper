package codehelper.web.servlet.store.logic;

import org.apache.ibatis.session.SqlSession;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.store.MemberStore;
import codehelper.web.servlet.store.mapper.MemberMapper;

public class MemberStoreLogic implements MemberStore {

	private CodeHelperSessionFactory factory;

	public MemberStoreLogic() {
		factory = CodeHelperSessionFactory.getInstance();
	}

	@Override
	public String create(Member member) {

		SqlSession session = factory.getSession();
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.insert(member);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.commit();
			session.close();
		}
		return member.getId();
	}

	@Override
	public void update(Member member) {
		SqlSession session = factory.getSession();
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.update(member);
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
	public void delete(String id) {
		SqlSession session = factory.getSession();
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			mapper.delete(id);
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
	public Member retrieve(String id) {
		SqlSession session = factory.getSession();
		Member memeber = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			memeber = mapper.selectById(id);
		}
		finally {
			session.close();
		}
		
		return memeber;
	}

}
