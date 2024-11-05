package com.test01;

public class MyNickName {
	private NickName nickname;
	
	public MyNickName() {	
	}

	public MyNickName(NickName nickname) {
		super();
		this.nickname = nickname;
	}

	public NickName getNickname() {
		return nickname;
	}

	public void setNickname(NickName nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "MyNickName [nickname=" + nickname + "]";
	}
	
}
