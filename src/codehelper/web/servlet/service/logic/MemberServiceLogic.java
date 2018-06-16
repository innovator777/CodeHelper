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
		Member member = new Member();
		member.setId(id);
		member.setPassword(password);
		String loginId = memberStore.retrieveWithPassword(member);
		member = memberStore.retrieve(loginId);
		
		return member;
		
	}

	@Override
	public void modifyMember(Member member) {
		memberStore.update(member);
		
	}

	@Override
	public void removeMember(String id) {
		memberStore.delete(id);
		
	}

	@Override
	public Member findMemeber(String id) {
		Member member = new Member();
		member=memberStore.retrieve(id);
		return member;
	}
	
}
