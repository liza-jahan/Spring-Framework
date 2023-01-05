package com.tuorial19.text.T19AutoWearing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
//	@Autowired   
	private ConsolWriter consolWriter;
	// @Autowired
	private LogWriter fileWriter;

	public Logger() {

	}

	public LogWriter getConsolWriter() {
		return consolWriter;
	}

	@Autowired
	@Qualifier("consoleWriter")
	public void setConsolWriter(ConsolWriter consolWriter) {
		this.consolWriter = consolWriter;
	}

	public LogWriter getFileWriter() {
		return fileWriter;
	}

	@Autowired
	@Qualifier("fileWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsol(String text) {

		consolWriter.write(text);

	}
}
