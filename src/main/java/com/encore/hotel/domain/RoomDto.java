package com.encore.hotel.domain;

public class RoomDto {
	private int id;
	private String name;
	private int peopleLimitedNumber;
	private String price;
	private int count;
	private String hotelId;
	private String img;

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "RoomDto [id=" + id + ", name=" + name + ", peopleLimitedNumber=" + peopleLimitedNumber + ", price="
				+ price + ", count=" + count + ", hotelId=" + hotelId + ", img=" + img + "]";
	}

}
