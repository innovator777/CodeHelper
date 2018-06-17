package codehelper.web.servlet.controller.report;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reportSendInfo.do")
public class ReportSendInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String questionId = request.getParameter("questionId");
		String answerId = request.getParameter("answerId");
		String attacker = request.getParameter("attacker");
		
		request.setAttribute("questionId", questionId);
		request.setAttribute("answerId", answerId);
		request.setAttribute("attacker", attacker);
		request.getRequestDispatcher("/views/report_register.jsp").forward(request, response);
	}

}
