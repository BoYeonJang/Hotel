package com.encore.hotel.domain;

public class HotelDto {
	private String id;
	private String name;
	private String location;
	private String img;
	private String description;
	private int approved;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getApproved() {
		return approved;
	}
	public void setApproved(int approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "HotelDto [id=" + id + ", name=" + name + ", location=" + location + ", img=" + img + ", description="
				+ description + ", approved=" + approved + "]";
	}
	
}
