package com.tk.action;

import org.springframework.stereotype.Controller;

@Controller
public class HelloAction {

	private String message;
	
	public String execute(){
		message = "hello,ss";
		System.out.println(message);
		return "success";
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
