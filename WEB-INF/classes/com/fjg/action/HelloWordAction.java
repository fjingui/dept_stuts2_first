package com.fjg.action;

public class HelloWordAction {
	private String msg;
	
	public String execute() {
		msg="�ҵĵ�һ��STRUTSӦ��";
		return "success" ;
	}

	public String getMsg() {
		return msg;
	}
}
