package codehelper.web.servlet.domain;

import java.util.Date;

public class Answer {
	
	private int id;
	private String contents;
	private Date date;
	private int likeCount;
	private Member writer;
	private int isChoose;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public int getLikeCount() {
		return likeCount;
	}
	
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	
	public Member getWriter() {
		return writer;
	}
	
	public void setWriter(Member writer) {
		this.writer = writer;
	}
	
	public int getIsChoose() {
		return isChoose;
	}
	
	public void setIsChoose(int isChoose) {
		this.isChoose = isChoose;
	}
	
	

}
