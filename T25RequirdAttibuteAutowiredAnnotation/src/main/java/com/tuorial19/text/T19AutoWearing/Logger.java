package com.tuorial19.text.T19AutoWearing;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
//	@Autowired   
	private ConsolWriter consolWriter;
	// @Autowired
	private FileWriter fileWriter;

	public Logger() {

	}

	@Autowired(required = false)
	public Logger(ConsolWriter consolWriter) {
	
		this.consolWriter = consolWriter;

	}

	public ConsolWriter getConsolWriter() {
		return consolWriter;
	}

	public void setConsolWriter(ConsolWriter consolWriter) {
		this.consolWriter = consolWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsol(String text) {
		if (consolWriter != null) {
			consolWriter.write(text);
		}

	}
}
