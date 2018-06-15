package codehelper.web.servlet.service.logic;

import java.util.List;

import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.service.ReportService;
import codehelper.web.servlet.store.ReportStore;
import codehelper.web.servlet.store.logic.ReportStoreLogic;

public class ReportServiceLogic implements ReportService{

	private ReportStore reportStore;
	
	public ReportServiceLogic() {
		reportStore = new ReportStoreLogic();
	}
	
	@Override
	public int addReport(Report report) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Report> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
