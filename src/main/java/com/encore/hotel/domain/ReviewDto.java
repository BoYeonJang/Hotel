package com.encore.hotel.domain;

public class ReviewDto {
	private int id;
	private String content;
	private String score;
	private String memberId;
	private String hotelId;
	
	public ReviewDto() {}

	public ReviewDto(int id, String content, String score, String memberId, String hotelId) {
		super();
		this.id = id;
		this.content = content;
		this.score = score;
		this.memberId = memberId;
		this.hotelId = hotelId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	@Override
	public String toString() {
		return "ReviewDto [id=" + id + ", content=" + content + ", score=" + score + ", memberId=" + memberId
				+ ", hotelId=" + hotelId + "]";
	}
	
}
