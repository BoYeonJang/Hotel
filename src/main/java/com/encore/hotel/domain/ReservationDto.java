package com.encore.hotel.domain;

public class ReservationDto {
	private int id;
	private String memberId;
	private int roomId;
	private String checkin;
	private String checkout;
	private int guestNumber;
	private String cardNumber;
	private String resDate;
	

	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
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
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public int getGuestNumber() {
		return guestNumber;
	}
	public void setGuestNumber(int guestNumber) {
		this.guestNumber = guestNumber;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "ReservationDto [id=" + id + ", memberId=" + memberId + ", roomId=" + roomId + ", checkin=" + checkin
				+ ", checkout=" + checkout + ", guestNumber=" + guestNumber + ", cardNumber=" + cardNumber + "]";
	}
	
}
