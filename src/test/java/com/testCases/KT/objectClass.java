package com.testCases.KT;

public class objectClass {
	
	String language = null;
	
	public void setLanguage() {
	language = "Hindi";
	System.out.println("This is Language: "+ language);
	}
	
	public String getLanguage() {
		return language;
	}
	
	public static void main(String[] args) {
		objectClass o1 = new objectClass();
		System.out.println(o1.language);
		o1.setLanguage();
		System.out.println(o1.language);
	}

}
