package codehelper.web.servlet.controller.bank;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.service.BankService;
import codehelper.web.servlet.service.logic.BankServiceLogic;

@WebServlet("/bankRemove.do")
public class BankRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("bankId"));
		
		BankService bankService = new BankServiceLogic();
		
		bankService.removeBankInfo(id);
		
		response.sendRedirect(request.getContextPath()+"/bankList.do");
	}

}
