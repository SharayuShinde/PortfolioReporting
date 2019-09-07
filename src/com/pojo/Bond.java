package com.pojo;

import java.util.Date;

public class Bond extends Security{
private float faceValue;
private float couponRate;
private String FrequencyOfPayment;
private Date maturity;


@Override
public String toString() {
	return "Bond [faceValue=" + faceValue + ", couponRate=" + couponRate + ", FrequencyOfPayment=" + FrequencyOfPayment
			+ ", maturity=" + maturity + "]";
}
public float getFaceValue() {
	return faceValue;
}
public void setFaceValue(float faceValue) {
	this.faceValue = faceValue;
}

public float getCouponRate() {
	return couponRate;
}
public Bond(String securitySymbol, String securityType, float faceValue, float couponRate, String frequencyOfPayment,
		Date maturity) {
	super(securitySymbol, securityType);
	this.faceValue = faceValue;
	this.couponRate = couponRate;
	FrequencyOfPayment = frequencyOfPayment;
	this.maturity = maturity;
}
public void setCouponRate(float couponRate) {
	this.couponRate = couponRate;
}
public String getFrequencyOfPayment() {
	return FrequencyOfPayment;
}
public void setFrequencyOfPayment(String frequencyOfPayment) {
	FrequencyOfPayment = frequencyOfPayment;
}
public Date getMaturity() {
	return maturity;
}
public void setMaturity(Date maturity) {
	this.maturity = maturity;
}
}
