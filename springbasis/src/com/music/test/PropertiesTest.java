package com.music.test;

public class PropertiesTest {
	
	private String testPropertie = null;

	public PropertiesTest(String testPropertie) {
		this.testPropertie = testPropertie;
	}
	
	public void displayTestPropertie(){
		System.out.println("testPropertie : " + testPropertie);
	}
}
