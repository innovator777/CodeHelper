package codehelper.web.servlet.domain;

public class CoinHistory {
	
	public enum Type {
		CHARGE,
		EXCHANGE,
		// 상의 필요
	}
	
	private int id;
	private String memberId;
	private Type type;
	private String questionId;
	//Date 정보가 없음 이대로 갈것인가?
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	
}
