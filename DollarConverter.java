/**
Author: Laura Thornburg
CIS 175 - Spring Semester
Date: 02/07/2023
*/

package model;

public class DollarConverter {
	private int converted;
	private double inputAmt;
	private double dollars;
	
	public DollarConverter() {
		super();
	}
	
	public DollarConverter(double inputAmt) {
		super();
		this.inputAmt = inputAmt;
		setConversion(inputAmt);
	}

	public void setInputAmt(int inputAmt) {
		this.inputAmt = inputAmt;
		setConversion(inputAmt);
	}

	public double getInputAmt() {
		return inputAmt;
	}

	public void setInputAmt(double inputAmt) {
		this.inputAmt = inputAmt;
	}

	public double getDollars() {
		return dollars;
	}

	public void setDollars(double dollars) {
		this.dollars = dollars;
	}
	
	public void setConversion(double inputAmt) {
		final double EURO = 0.932;
		
		dollars = inputAmt * EURO;
	}

	@Override
	public String toString() {
		return "DollarConverter [dollars=" + dollars + "]";
	}

}
