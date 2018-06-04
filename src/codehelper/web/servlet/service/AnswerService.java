package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Answer;

public interface AnswerService {
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int addAnswer(Answer answer);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	void modifyAnswer(Answer answer);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	void removeAnswer(int id);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<Answer> findByQuestion(int qid);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	boolean choose(int qid, int aid);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int liked(int id);
}
