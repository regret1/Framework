package com.test03;

import org.springframework.stereotype.Component;

@Component("sam")
public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		System.out.println("samsung Tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsung Tv power off");
	}

	@Override
	public void volUp() {
		System.out.println("samsung Tv vol up");
	}

	@Override
	public void volDown() {
		System.out.println("samsung Tv vol down");
	}
	

}
