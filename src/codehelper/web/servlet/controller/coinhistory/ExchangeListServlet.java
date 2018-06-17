package codehelper.web.servlet.controller.coinhistory;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;

@WebServlet("/exchangeList.do")
public class ExchangeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CoinHistoryService coinhistoryService = new CoinHistoryServiceLogic();
		
		Member member = (Member)request.getSession().getAttribute("member");
		
		List<CoinHistory> coins = coinhistoryService.findByMember(member.getId());

		request.setAttribute("member", member);
		request.setAttribute("coins", coins);
		request.getRequestDispatcher("/views/coin_exchange.jsp").forward(request, response);
	}

}
