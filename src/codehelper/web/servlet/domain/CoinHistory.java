package codehelper.web.servlet.domain;

public class CoinHistory {
	
	public enum Type {
		CHARGE,
		EXCHANGE,
		// 상의 필요
	}
	
	private int id;
	private Member member;
	private Type type;
	private Question question;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Member getMember() {
		return member;
	}
	
	public void setMember(Member member) {
		this.member = member;
	}
	
	public Type getKind() {
		return type;
	}
	
	public void setKind(Type type) {
		this.type = type;
	}
	
	public Question getQuestion() {
		return question;
	}
	
	public void setQuestion(Question question) {
		this.question = question;
	}
}
