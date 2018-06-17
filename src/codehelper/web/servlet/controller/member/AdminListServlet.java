package codehelper.web.servlet.controller.member;

import java.io.IOException;
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
		
		String id =(String)request.getSession().getAttribute("loginId");
		Member member = memberService.findMember(id);
		ReportService reportService = new ReportServiceLogic();
		List<Report> reports = reportService.findAll();
		
		request.setAttribute("reports", reports);
		request.setAttribute("name", member.getName());
		request.setAttribute("id", member.getId());
		request.setAttribute("balance", member.getBalance());
		request.getRequestDispatcher("/views/my_admin.jsp").forward(request, response);
	}

}
