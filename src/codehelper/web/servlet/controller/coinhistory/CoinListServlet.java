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
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;

@WebServlet("/coinList.do")
public class CoinListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("memberId");
		
		CoinHistoryService coinhistoryService = new CoinHistoryServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		
		List<CoinHistory> coins = coinhistoryService.findByMember(id);
		Member member = memberService.findMemeber(id);

		request.setAttribute("member", member);
		request.setAttribute("coins", coins);
		request.getRequestDispatcher("/views/coin_list.jsp").forward(request, response);
		
	}

}
