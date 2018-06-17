package codehelper.web.servlet.controller.question;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import codehelper.web.servlet.domain.CoinHistory;
import codehelper.web.servlet.domain.CoinHistoryType;
import codehelper.web.servlet.domain.Member;
import codehelper.web.servlet.domain.Question;
import codehelper.web.servlet.service.CoinHistoryService;
import codehelper.web.servlet.service.MemberService;
import codehelper.web.servlet.service.QuestionService;
import codehelper.web.servlet.service.logic.CoinHistoryServiceLogic;
import codehelper.web.servlet.service.logic.MemberServiceLogic;
import codehelper.web.servlet.service.logic.QuestionServiceLogic;

@WebServlet("/questionAdd.do")
public class QuestionAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		QuestionService questionService = new QuestionServiceLogic();
		MemberService memberService = new MemberServiceLogic();
		CoinHistoryService coinHistoryService = new CoinHistoryServiceLogic();
		
		String loginId = (String)request.getSession().getAttribute("loginId");
		Member member = memberService.findMember(loginId);
		
		if(member.getBalance() < 1000) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('캐쉬가 부족합니다!!!');");
			out.println("history.back();");
			out.println("</script>");
		}
		else {
			Question question = new Question();
			question.setTitle(request.getParameter("qTitle"));
			question.setContents(request.getParameter("qContents"));
			Date today = new Date(Calendar.getInstance().getTimeInMillis());
			question.setCreatedDate(today);
			question.setMemberId(member.getId());
			
			int result = questionService.addQuestion(question);
			if (result == 1) {
				CoinHistory coinHistory = new CoinHistory();
				coinHistory.setMemberId(member.getId());
				coinHistory.setType(CoinHistoryType.ASKED);
				coinHistory.setAmount(1000);
				coinHistory.setBalance(member.getBalance() - 1000);
				coinHistory.setQuestionId(question.getId());
				System.out.println(question.getId());
				coinHistoryService.addCoinHistory(coinHistory);
				
				member.setBalance(member.getBalance() - 1000);
				memberService.modifyMember(member);
				request.getRequestDispatcher("questionList.do").forward(request, response);
			}
		}
	}
}
