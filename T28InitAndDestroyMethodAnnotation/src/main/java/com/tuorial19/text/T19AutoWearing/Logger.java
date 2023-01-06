package com.tuorial19.text.T19AutoWearing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Logger {
	private ConsolWriter consolWriter;
	private LogWriter fileWriter;

	@Resource
	public void setConsolWriter(ConsolWriter consolWriter) {
		this.consolWriter = consolWriter;
	}

	@Resource(name = "demoWriter")
	public void setFileWriter(LogWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}

	public void writeConsol(String text) {

		consolWriter.write(text);

	}

	@PostConstruct
	public void init() {
		System.out.println("create bean");
	}
   
	@PreDestroy
	public void destroy() {
		System.out.println("Destory bean");
	}

}
