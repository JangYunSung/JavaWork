package com.lec.beans;

public class CountBean {
	private int cntNumber;
	
	
	
	
	public CountBean() {
		System.out.println("CountBean 생성!!");
	}
	
	
	
	public void setCount(int n) {
		cntNumber += n;     // 기존의 값에 더 해진다.
	}
	
	
	public int getCount() {
		return cntNumber;
	}
	
	
	
	
	
	
	
}
