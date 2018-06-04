package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportStore {
	
	int create(Report report);
	void update(Report report);
	List<Report> retrieveAll();

}
