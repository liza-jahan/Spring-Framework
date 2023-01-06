package com.tuorial19.text.T19AutoWearing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fileWriter")
public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
		System.out.println("print filewriter : "+text);
	}

}
