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
		
		if (loginId != null && !loginId.isEmpty() ) {
			return memberStore.retrieve(loginId);
		}
		return null;
	}

	@Override
	public void modifyMember(Member member) {
		memberStore.update(member);
	}

	@Override
	public int removeMember(String id) {
		return memberStore.delete(id);		
	}

	@Override
	public Member findMember(String id) {
		Member member = new Member();
		member=memberStore.retrieve(id);
		return member;
	}
	
}
