package codehelper.web.servlet.controller.coinhistory;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.CoinHistoryType;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/exchange.do")
public class ExchangeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		CoinHistoryService coinHistoryService = new CoinHistoryServiceLogic();
		MemberService memberService = new MemberServiceLogic();

		String id = (String) request.getSession().getAttribute("loginId");
		String amount = request.getParameter("cash");

		Member member = memberService.findMember(id);
		if (Integer.parseInt(amount) - member.getBalance() > 0) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('캐쉬가 부족합니다!!!');");
			out.println("history.back();");
			out.println("</script>");
		} else {
			CoinHistory coinHistory = new CoinHistory();
			coinHistory.setType(CoinHistoryType.EXCHANGE);
			coinHistory.setAmount(Integer.parseInt(amount));
			coinHistory.setMemberId(member.getId());
			coinHistory.setBalance(member.getBalance() - Integer.parseInt(amount));
			coinHistoryService.exchange(coinHistory);
			response.sendRedirect(request.getContextPath() + "/exchangeList.do");
		}
	}

}
