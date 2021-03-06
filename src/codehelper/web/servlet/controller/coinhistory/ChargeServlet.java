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
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/charge.do")
public class ChargeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		CoinHistoryService coinHistoryService = new CoinHistoryServiceLogic();
		MemberService memberService = new MemberServiceLogic();
	
		CoinHistory coinHistory = new CoinHistory();
		coinHistory.setType(CoinHistoryType.CHARGE);
		String amount = request.getParameter("coinAmount");
		coinHistory.setAmount(Integer.parseInt(amount));
		String loginId = (String)request.getSession().getAttribute("loginId");
		Member member = memberService.findMember(loginId);
		coinHistory.setMemberId(member.getId());
		coinHistory.setBalance(member.getBalance() + Integer.parseInt(amount));
		coinHistoryService.charge(coinHistory);
		
		response.sendRedirect(request.getContextPath()+"/memberList.do");
	}

}
