package codehelper.web.servlet.controller.question;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.Answer;
import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.CoinHistoryType;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.AnswerService;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.AnswerServiceLogic;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/choose.do")
public class ChooseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		AnswerService answerService = new AnswerServiceLogic();
		CoinHistoryService coinHistoryService = new CoinHistoryServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		
		String questionId = request.getParameter("questionId");
		String answerId = request.getParameter("answerId");
		
		questionService.choose(Integer.parseInt(questionId), Integer.parseInt(answerId));
		answerService.choose(Integer.parseInt(questionId), Integer.parseInt(answerId));
		
		Answer answer = answerService.findById(Integer.parseInt(answerId));
		Member member = memberService.findMember(answer.getMemberId());
		
		CoinHistory coinHistory = new CoinHistory();
		coinHistory.setMemberId(answer.getMemberId());
		coinHistory.setQuestionId(Integer.parseInt(questionId));
		coinHistory.setAmount(1000);
		coinHistory.setBalance(member.getBalance() + 1000);
		coinHistory.setType(CoinHistoryType.CHOSE);
		coinHistoryService.addCoinHistory(coinHistory);
		
		member.setBalance(member.getBalance() + 1000);
		memberService.modifyMember(member);
		
		request.setAttribute("questionId", questionId);
		request.getRequestDispatcher("questionDetail.do").forward(request, response);
	}

}