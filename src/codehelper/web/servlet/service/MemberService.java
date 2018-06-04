package codehelper.web.servlet.service;

import codehelper.web.servlet.domain.Member;

public interface MemberService {
	
	/**
     * 회원가입
     * 
     * @param member
     * @return
     */
	String registerMember(Member member);
	
	/**
     * 로그인
     * 
     * @param id, password
     * @return
     */
	Member login(String id, String password);
	
	/**
     * 회원정보 변경
     * 
     * @param member
     * @return
     */
	void modifyMember(Member member);
	
	/**
     * 회원 탈퇴
     * 
     * @param id
     * @return
     */
	void removeMember(String id);
	
	
	/**
     * 회원 조회
     * 
     * @param id
     * @return
     */
	Member findMemeber(String id);
}
