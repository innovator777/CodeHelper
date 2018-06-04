package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportService {
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	int addReport(Report report);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	void modifyReport(Report report);
	
	/**
     *  
     * 
     * @param  
     * @return
     */
	List<Report> findAll();

}
