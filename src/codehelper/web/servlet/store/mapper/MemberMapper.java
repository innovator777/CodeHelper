package codehelper.web.servlet.store.mapper;

import codehelper.web.servlet.domain.Member;

public interface MemberMapper {
	
	int insert(Member member);
	void update(Member member);
	int delete(String memberId);
	Member selectById(String memberId);
}