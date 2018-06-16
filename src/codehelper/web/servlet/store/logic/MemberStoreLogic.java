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
	public int delete(String id) {
		SqlSession session = factory.getSession();
		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
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
	public Member retrieve(String id) {
		SqlSession session = factory.getSession();
		Member member = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			member = mapper.selectById(id);
		}
		finally {
			session.close();
		}
		
		return member;
	}

	@Override
	public String retrieveWithPassword(Member member) {
		SqlSession session = factory.getSession();
		String memberId = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			memberId = mapper.selectByPassword(member);
		}
		finally {
			session.close();
		}
		return memberId;
	}

}
