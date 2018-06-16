package codehelper.web.servlet.store;

import codehelper.web.servlet.domain.Member;

public interface MemberStore {
	
	String create(Member member);
	void update(Member member);
	int delete(String id);
	Member retrieve(String id);
	String retrieveWithPassword(Member member);

}
