package codehelper.web.servlet.store.mapper;

import codehelper.web.servlet.domain.Member;

public interface MemberMapper {
	
	void insert(Member member);
	void update(Member member);
	void delete(String memberId);
	Member selectById(String memberId);
}
