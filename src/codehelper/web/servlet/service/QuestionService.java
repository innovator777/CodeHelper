package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;

public interface QuestionService {
	
	/**
	 * 
	 * 
	 * @param
	 * @return
	 */
	int addQuestion(Question question);
	
	/**
     * 
     * 
     * @param 
     * @return
     */
	void modifyQuestion(Question question);
	
	/**
     * 
     * 
     * @param 
     * @return
     */
	void removeQuestion(int id); // 삭제 후 리턴값 상의
	
	/**
     * 
     * 
     * @param 
     * @return
     */
	Question find(int id);
	
	/**
     * 
     * 
     * @param 
     * @return
     */
	List<Question> findByMemeber(Member member);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<Question> findAll();
}
