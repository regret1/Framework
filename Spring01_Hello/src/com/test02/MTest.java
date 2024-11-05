package com.test02;

import com.test03.MessageBean;
import com.test03.MessageBeanEn;
import com.test03.MessageBeanKo;

public class MTest {

	public static void main(String[] args) {
		MessageBean bean = new MessageBeanEn();
		bean.sayHello("Spring");
		
		bean = new MessageBeanKo();
		bean.sayHello("스프링");
	}

}
