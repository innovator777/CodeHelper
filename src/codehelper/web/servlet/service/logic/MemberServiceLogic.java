package codehelper.web.servlet.service.logic;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.store.MemberStore;
import codehelper.web.servlet.store.logic.MemberStoreLogic;

public class MemberServiceLogic implements MemberService{

	private MemberStore memberStore;
	
	public MemberServiceLogic() {
		memberStore = new MemberStoreLogic();
	}
	
	@Override
	public String registerMember(Member member) {
		return memberStore.create(member);
	}

	@Override
	public Member login(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyMember(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Member findMemeber(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
