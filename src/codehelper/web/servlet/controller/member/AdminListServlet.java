package codehelper.web.servlet.controller.member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.ReportService;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.ReportServiceLogic;

@WebServlet("/adminList.do")
public class AdminListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		MemberService memberService = new MemberServiceLogic();
		
		ReportService reportService = new ReportServiceLogic();
		List<Report> reports = reportService.findAll();
		
		if(reports != null && !reports.isEmpty()) {
			List<String> reporters = new ArrayList<>();
			List<String> attackers = new ArrayList<>();
			
			for(Report report : reports) {
				reporters.add(memberService.findMember(report.getMemberId()).getName());
				attackers.add(memberService.findMember(report.getAttacker()).getName());
			}
			request.setAttribute("reporters", reporters);
			request.setAttribute("attackers", attackers);
		}
		
		request.setAttribute("reports", reports);
		request.setAttribute("name", "관리자");
		request.setAttribute("id", "admin");
		request.setAttribute("balance", "99999999999999");
		request.getRequestDispatcher("/views/my_admin.jsp").forward(request, response);
	}

}
