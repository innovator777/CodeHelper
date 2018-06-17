package codehelper.web.servlet.controller.coinhistory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/coinList.do")
public class CoinListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		CoinHistoryService coinhistoryService = new CoinHistoryServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		QuestionService questionService = new QuestionServiceLogic();
		
		List<CoinHistory> coins = coinhistoryService.findByMember(id);
		
		if(coins != null && !coins.isEmpty()) {
			List<String> questionTitles = new ArrayList<>();
			for(CoinHistory coinHistory : coins) {
				int qId = coinHistory.getQuestionId();
				if(qId > 0) {
					questionTitles.add(questionService.find(qId).getTitle());
				}
				else {
					questionTitles.add("");
				}
			}
			request.setAttribute("questionTitles", questionTitles);
		}
		
		
		int balance = memberService.findMember(id).getBalance();

		request.setAttribute("balance", balance);
		request.setAttribute("coins", coins);
		request.getRequestDispatcher("/views/coin_list.jsp").forward(request, response);
		
	}

}
