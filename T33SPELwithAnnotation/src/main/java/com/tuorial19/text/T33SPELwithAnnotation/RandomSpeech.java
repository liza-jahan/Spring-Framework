package com.tuorial19.text.T33SPELwithAnnotation;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomSpeech {
	private static String[] texts = { "I'll be back", "Get out!", "I want your clothes,boots and motorcycle.", null };

	public String getTexts() {
		Random random = new Random();
		return texts[random.nextInt(texts.length)];
	}

}
