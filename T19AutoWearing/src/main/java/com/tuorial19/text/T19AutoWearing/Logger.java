package com.tuorial19.text.T19AutoWearing;

public class Logger {
	private ConsolWriter consolWriter;
	private FileWriter fileWriter;

	public ConsolWriter getConsolWriter() {
		return consolWriter;
	}

	public void setConsolWriter(ConsolWriter consolWriter) {
		this.consolWriter = consolWriter;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);

	}

	public void writeConsol(String text) {
	 consolWriter.write(text);	
	}
 
}
