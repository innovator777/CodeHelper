package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportMapper {
	int insert(Report report);
	void update(Report report);
	Report retrieveById(int id);
	List<Report> retrieveAll();
}