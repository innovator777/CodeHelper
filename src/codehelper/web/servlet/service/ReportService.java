package codehelper.web.servlet.service;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportService {
	
	int addReport(Report report);
	void modifyReport(Report report);
	Report findById(int id);
	List<Report> findAll();

}
