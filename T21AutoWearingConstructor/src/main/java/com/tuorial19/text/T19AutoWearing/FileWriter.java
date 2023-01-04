package com.tuorial19.text.T19AutoWearing;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("print filewriter : "+text);
	}

}
