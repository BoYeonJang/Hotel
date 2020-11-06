package com.encore.hotel.domain;

public class OptionDto {
	private String checkin;
	private String checkout;
	private int limit;
	private String hotel;
	public OptionDto() {}
	public OptionDto(String checkin, String checkout, int limit, String hotel) {
		super();
		this.checkin = checkin;
		this.checkout = checkout;
		this.limit = limit;
		this.hotel = hotel;
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
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "OptionDto [checkin=" + checkin + ", checkout=" + checkout + ", limit=" + limit + ", hotel=" + hotel
				+ "]";
	}
	
	
	
}
