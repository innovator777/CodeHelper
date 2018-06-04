package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.CoinHistory;

public interface CoinHistoryService {
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int charge(CoinHistory coinHistory, int coinAmount);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int exchange(CoinHistory coinHistory, int coinAmount);
	
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<CoinHistory> findByMember(String id);

}
