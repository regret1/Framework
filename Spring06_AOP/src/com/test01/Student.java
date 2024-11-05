package com.test01;

public class Student {
	public void classWork() {
		System.out.println("일어나서 컴퓨터를 킨다.");
		
		try {
			System.out.println("컴퓨터를 켜서 qr을 찍는다.");
		} catch (Exception e) {
			System.out.println("쉬는 날이었다.");
			e.printStackTrace();
		}finally {
			System.out.println("침대에 눕는다.");
		}
		
		
		
		
		
	}
}
