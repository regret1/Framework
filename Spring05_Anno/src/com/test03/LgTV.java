package com.test03;

import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {

    @Override
    public void powerOn() {
        System.out.println("LG TV를 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("LG TV를 끕니다.");
    }

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		
	}
}
