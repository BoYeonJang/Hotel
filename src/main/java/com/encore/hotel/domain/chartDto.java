package com.encore.hotel.domain;

public class chartDto {
	private int cnt;
	private int mo;
	
	public chartDto() {
		// TODO Auto-generated constructor stub
	}

	public chartDto(int mo, int cnt) {
		super();
		this.mo = mo;
		this.cnt = cnt;
	}

	public int getMo() {
		return mo;
	}

	public void setMo(int mo) {
		this.mo = mo;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "chartDto [mo=" + mo + ", cnt=" + cnt + "]";
	}
	
	
}