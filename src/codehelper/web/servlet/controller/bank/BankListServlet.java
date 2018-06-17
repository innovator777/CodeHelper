package codehelper.web.servlet.controller.bank;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.service.BankService;
import codehelper.web.servlet.service.logic.BankServiceLogic;

@WebServlet("/bankList.do")
public class BankListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = (String)request.getSession().getAttribute("loginId");
		
		BankService bankService = new BankServiceLogic();
		
		List<Bank> banks = bankService.findByMember(id);
		request.setAttribute("banks", banks);
		request.getRequestDispatcher("/views/bank_search.jsp").forward(request, response);
		
		
	}

}
