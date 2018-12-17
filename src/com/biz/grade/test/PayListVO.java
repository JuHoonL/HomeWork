package com.biz.grade.test;

public class PayListVO {

	private String wName;
	private String wPay;
	
	private int intFMCount;
	private int intMCount;
	private int intFThCount;
	private int intThCount;
	private int intFHCount;
	private int intHCount;
	private int intFTCount;
	private int intTCount;
	private int intOCount;

	
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public String getwPay() {
		return wPay;
	}
	public void setwPay(String wPay) {
		this.wPay = wPay;
	}
	public int getIntFMCount() {
		return intFMCount;
	}
	public void setIntFMCount(int intFMCount) {
		this.intFMCount = intFMCount;
	}
	public int getIntMCount() {
		return intMCount;
	}
	public void setIntMCount(int intMCount) {
		this.intMCount = intMCount;
	}
	public int getIntFThCount() {
		return intFThCount;
	}
	public void setIntFThCount(int intFThCount) {
		this.intFThCount = intFThCount;
	}
	public int getIntThCount() {
		return intThCount;
	}
	public void setIntThCount(int intThCount) {
		this.intThCount = intThCount;
	}
	public int getIntFHCount() {
		return intFHCount;
	}
	public void setIntFHCount(int intFHCount) {
		this.intFHCount = intFHCount;
	}
	public int getIntHCount() {
		return intHCount;
	}
	public void setIntHCount(int intHCount) {
		this.intHCount = intHCount;
	}
	public int getIntFTCount() {
		return intFTCount;
	}
	public void setIntFTCount(int intFTCount) {
		this.intFTCount = intFTCount;
	}
	public int getIntTCount() {
		return intTCount;
	}
	public void setIntTCount(int intTCount) {
		this.intTCount = intTCount;
	}
	public int getIntOCount() {
		return intOCount;
	}
	public void setIntOCount(int intOCount) {
		this.intOCount = intOCount;
	}

	public String toString() {
		return "PayListVO [이름=" + wName + ", 급여액=" + wPay + ", 오만원권=" + intFMCount + ", 만원권="
				+ intMCount + ", 오천원권=" + intFThCount + ", 천원권=" + intThCount + ", 오백원권="
				+ intFHCount + ", 백원권=" + intHCount + ", 오십원권=" + intFTCount + ", 십원권=" + intTCount
				+ ", 일원권=" + intOCount + "]";
	}
	
	
}
