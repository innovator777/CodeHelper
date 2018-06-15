package codehelper.web.servlet.service;

import codehelper.web.servlet.domain.Member;

public interface MemberService {

	String registerMember(Member member);
	Member login(String id, String password);
	void modifyMember(Member member);
	void removeMember(String id);
	Member findMemeber(String id);
	
}
