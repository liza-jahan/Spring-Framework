package com.tuorial19.text.T19AutoWearing;

import org.springframework.stereotype.Component;

@Component
public class ConsolWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println(text);
   
	}

}
