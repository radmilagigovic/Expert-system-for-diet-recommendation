package com.javainuse.model;

public class BodyMassIndex {
	public int bmi;
	public int godine;
	public String BodyMassIndex= "Body mass index(BMI) nije ispravno unesen, stanje vaseg tela se ne moze odrediti";
	//public String Bodymassindex;
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	public int getBmi() {
		return bmi;
	}
	public void setBmi(int bmi) {
		this.bmi = bmi;
	}
	public String getBodyMassIndex() {
		return BodyMassIndex;
	}
	public void setBodyMassIndex(String bodyMassIndex) {
		BodyMassIndex = bodyMassIndex;
	}
	
}
