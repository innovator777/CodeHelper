package codehelper.web.servlet.controller.report;

import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.domain.ReportType;
import codehelper.web.servlet.service.ReportService;
import codehelper.web.servlet.service.logic.ReportServiceLogic;

@WebServlet("/reportAdd.do")
public class ReportAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReportService reportService = new ReportServiceLogic();
		
		String questionId = request.getParameter("questionId");
		String answerId = request.getParameter("answerId");
		String attacker = request.getParameter("attacker");
		String contents = request.getParameter("contents");
		
		Report report = new Report();
		report.setAnswerId(Integer.valueOf(answerId));
		report.setQuestionId(Integer.valueOf(questionId));
		report.setAttacker(attacker);
		report.setContents(ReportType.valueOf(Integer.valueOf(contents)));
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		report.setCreateDate(today);
		Member member = (Member)request.getSession().getAttribute("member");
		report.setMemberId(member.getId());
		reportService.addReport(report);
		
		request.setAttribute("questionId", Integer.valueOf(questionId));
		request.getRequestDispatcher("question_detail.jsp").forward(request, response);
	}

}
