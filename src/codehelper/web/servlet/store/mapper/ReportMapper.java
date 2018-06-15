package codehelper.web.servlet.store.mapper;

import java.util.List;

import codehelper.web.servlet.domain.Report;

public interface ReportMapper {
	int create(Report report);
	void update(Report report);
	List<Report> retrieveAll();
}