package com.tuorial19.text.T31IntroducingSPEL;

import javax.print.event.PrintJobAttributeEvent;

import org.springframework.stereotype.Component;
@Component
public class Parrot {
	private int id;
	private String speak;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSpeak(String speak) {
		this.speak = speak;
	}
	
	public void speak() {
		System.out.println(id + ":" + speak);
	}

}
