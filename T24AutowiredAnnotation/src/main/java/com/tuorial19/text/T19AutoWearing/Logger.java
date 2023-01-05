package com.tuorial19.text.T19AutoWearing;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
//	@Autowired   //property Autowired            ///property auto wired korle set method na thakle o run korbe .....
	private ConsolWriter consolWriter;
	//@Autowired
	private FileWriter fileWriter;

	
	
	
	
   @Autowired              //constructor auto wired                 .......constructor and property auto wired ak sathe kora jay....
	public Logger(ConsolWriter consolWriter, FileWriter fileWriter) {
		super();
		this.consolWriter = consolWriter;
		this.fileWriter = fileWriter;
	}

	public LogWriter getConsolWriter() {
		return consolWriter;
	}
  //  @Autowired    method autowiring
//	public void setConsolWriter(ConsolWriter consolWriter) {
//		this.consolWriter = consolWriter;
//	}

	public LogWriter fileWriter() {
		return fileWriter;
	}
  //  @Autowired
//	public void setFileWriter(FileWriter fileWriter) {
//		this.fileWriter = fileWriter;
//	}

	public void writeFile(String text) {
		fileWriter.write(text);

	}

	public void writeConsol(String text) {
		consolWriter.write(text);
	}

}
