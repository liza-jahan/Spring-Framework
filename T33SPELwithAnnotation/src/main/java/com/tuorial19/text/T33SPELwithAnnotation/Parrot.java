package com.tuorial19.text.T33SPELwithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

	private String id;
	private String speech;

	@Autowired
	public void setId(@Value("#{randomSpeech.getTexts()?.length()}") String id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("#{randomSpeech.getTexts()}") String speech) {
		this.speech = speech;
	}

	public void speak() {
		System.out.println(id + ":" + speech);
	}
}
