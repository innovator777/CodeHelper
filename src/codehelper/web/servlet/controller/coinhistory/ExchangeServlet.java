package codehelper.web.servlet.controller.coinhistory;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.CoinHistoryType;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;

@WebServlet("/exchange.do")
public class ExchangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CoinHistoryService coinHistoryService = new CoinHistoryServiceLogic();
	
		CoinHistory coinHistory = new CoinHistory();
		coinHistory.setType(CoinHistoryType.EXCHANGE);
		String amount = request.getParameter("cash");
		coinHistory.setAmount(Integer.parseInt(amount));
		Member member = (Member)request.getSession().getAttribute("member");
		coinHistory.setMemberId(member.getId());
		coinHistory.setBalance(member.getBalance() - Integer.parseInt(amount));
		coinHistoryService.exchange(coinHistory);

		response.sendRedirect(request.getContextPath()+"/views/my_member.jsp");
	}

}
