package com.us.demo.enume;

public enum Gender {
	EXCEPTION("异常");
	private String name;
	Gender(){
		name="";
	}
	Gender(String name){this.name=name;}
	public String getName(){
		return name;
	}
}

