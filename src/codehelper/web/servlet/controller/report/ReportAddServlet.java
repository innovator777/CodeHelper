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
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.ReportService;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.ReportServiceLogic;

@WebServlet("/reportAdd.do")
public class ReportAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReportService reportService = new ReportServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		
		String questionId = request.getParameter("questionId");
		String answerId = request.getParameter("answerId");
		String attacker = request.getParameter("attacker");
		String contents = request.getParameter("contents");
		
		
		Report report = new Report();
		if(!questionId.isEmpty() && !answerId.isEmpty()) {
			report.setQuestionId(Integer.valueOf(questionId));
			report.setAnswerId(Integer.valueOf(answerId));
		}
		else if(!questionId.isEmpty() && answerId.isEmpty()) {
			report.setQuestionId(Integer.valueOf(questionId));
		}
		Member attackerMember = memberService.findMemeber(attacker);
		report.setAttacker(attackerMember.getName());
		report.setContents(ReportType.valueOf(Integer.valueOf(contents)));
		Date today = new Date(Calendar.getInstance().getTimeInMillis());
		report.setCreateDate(today);
		
		String loginId = (String)request.getSession().getAttribute("loginId");
		Member member = memberService.findMemeber(loginId);
		report.setMemberId(member.getId());
		reportService.addReport(report);
		
		request.setAttribute("questionId", Integer.valueOf(questionId));
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
	}

}
