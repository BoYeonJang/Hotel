package com.encore.hotel.domain;

public class RoomDto {
	private int id;
	private String name;
	private int peopleLimitedNumber;
	private int price;
	private int count;
	private String hotelId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeopleLimitedNumber() {
		return peopleLimitedNumber;
	}
	public void setPeopleLimitedNumber(int peopleLimitedNumber) {
		this.peopleLimitedNumber = peopleLimitedNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "RoomDto [id=" + id + ", name=" + name + ", peopleLimitedNumber=" + peopleLimitedNumber + ", price="
				+ price + ", count=" + count + ", hotelId=" + hotelId + "]";
	}
	
	
	
}
