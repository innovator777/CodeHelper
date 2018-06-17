package codehelper.web.servlet.controller.coinhistory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Bank;
import codehelper.web.servlet.service.BankService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.BankServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/exchangeList.do")
public class ExchangeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		MemberService memberService = new MemberServiceLogic();
		BankService bankService = new BankServiceLogic();
		
		String id = (String)request.getSession().getAttribute("loginId");
		int balance = memberService.findMember(id).getBalance();
		
		List<Bank> banks = bankService.findByMember(id);

		request.setAttribute("balance",balance);
		request.setAttribute("banks", banks);
		request.getRequestDispatcher("/views/coin_exchange.jsp").forward(request, response);
	}

}
