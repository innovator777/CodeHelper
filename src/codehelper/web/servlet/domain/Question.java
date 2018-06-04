package codehelper.web.servlet.domain;

import java.util.Date;
import java.util.List;

public class Question {
	
	private int id;
	private String title;
	private String contents;
	private Date date;
	private int readCount;
	private Member writer;
	private int answersCount;
	private int isChoose;
	private List<Answer> answers;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getReadCount() {
		return readCount;
	}
	
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	
	public Member getWriter() {
		return writer;
	}
	
	public void setWriter(Member writer) {
		this.writer = writer;
	}
	
	public int getAnswersCount() {
		return answersCount;
	}
	
	public void setAnswersCount(int answersCount) {
		this.answersCount = answersCount;
	}
	
	public int getIsChoose() {
		return isChoose;
	}
	
	public void setIsChoose(int isChoose) {
		this.isChoose = isChoose;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
