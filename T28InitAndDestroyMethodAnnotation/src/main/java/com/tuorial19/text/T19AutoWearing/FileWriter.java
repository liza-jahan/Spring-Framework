package com.tuorial19.text.T19AutoWearing;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("fileWriter")
public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("print filewriter : "+text);
	}

}
