package codehelper.web.servlet.store;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportStore {
	
	int create(Report report);
	void update(Report report);
	Report retrieveById(int id);
	List<Report> retrieveAll();

}
