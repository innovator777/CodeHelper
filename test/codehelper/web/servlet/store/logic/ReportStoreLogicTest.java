package codehelper.web.servlet.store.logic;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.domain.ReportType;
import codehelper.web.servlet.store.ReportStore;

public class ReportStoreLogicTest {

	ReportStore store;
	
	@Before
	public void ReportStoreLogic() {
		store = new ReportStoreLogic();
	}
	
	@Test
	public void testCreate() {
//		Report report = new Report();
//		report.setContents(ReportType.A);
//		Date today = new Date(Calendar.getInstance().getTimeInMillis());
//		report.setCreateDate(today);
//		report.setAnswerId(1);
//		report.setQuestionId(1);
//		report.setMemberId("asd@bu.ac.kr");
//		report.setAttacker("qwe@bu.ac.kr");
//		assertEquals(1, store.create(report));
	}

	@Test
	public void testUpdate() {
//		Report report = new Report();
//		report.setId(10);
//		report.setChecked(1);
//		store.update(report);
	}

	@Test
	public void testRetrieveAll() {
//		List<Report> list = store.retrieveAll();
//		assertEquals(1, list.get(0).getContents().getValue());
	}

}
