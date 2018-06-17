package codehelper.web.servlet.controller.report;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Report;
import codehelper.web.servlet.service.ReportService;
import codehelper.web.servlet.service.logic.ReportServiceLogic;

@WebServlet("/reportModify.do")
public class ReportModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ReportService reportService = new ReportServiceLogic();
		
		String reportId = request.getParameter("reportId");
		Report report = reportService.findById(Integer.parseInt(reportId));
		report.setChecked(1);
		reportService.modifyReport(report);
		
		response.sendRedirect("views/my_admin.jsp");
	}

}
