package codehelper.web.servlet.controller.bank;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.BankService;
import codehelper.web.servlet.service.logic.BankServiceLogic;

@WebServlet("/bankAdd.do")
public class BankAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bankName=request.getParameter("bankName");
		String bankNum = request.getParameter("bankNum");
		String name = request.getParameter("name");
		
		HttpSession session = request.getSession();
		Member member = (Member)session.getAttribute("member");
		
		Bank bank = new Bank();
		
		bank.setName(bankName);
		bank.setAccountNumber(bankNum);
		bank.setAccountHolder(name);
		bank.setmId(member.getId());
		
		BankService bankService = new BankServiceLogic();
		
		bankService.addBankInfo(bank);
		
		response.sendRedirect(request.getContextPath());
		
		
	}

}
