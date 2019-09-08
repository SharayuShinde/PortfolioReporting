package com.logic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CalculateUnRealizedPL {

	public double equityRealizedPL(float faceValue, float marketPrice,int quantity) {
		
		double difference=marketPrice-faceValue;
		double pl = difference*quantity;
		return pl;
	}

	public double bondRealizedPL(float faceValue, float coupanRate, String frequencyOfPayments, Date maturity, Date tradeDate, float price, float marketPrice) {

		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("Current DateTime: " + currentTime);

		LocalDate currentDate = currentTime.toLocalDate();
		LocalDate maturityDate =maturity.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate buyingDate =tradeDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int holdingDays=(int) buyingDate.until(currentDate, ChronoUnit.DAYS);		int days=(int) buyingDate.until(currentDate, ChronoUnit.DAYS);
		int  diffInMatAndCurrDate=(int) currentDate.until(maturityDate, ChronoUnit.DAYS);
		double interest = (faceValue*coupanRate*holdingDays)*(365*100);
		double totalRevenue=0;
		if(diffInMatAndCurrDate>0)
		totalRevenue=interest+marketPrice;
		else
		totalRevenue=interest+faceValue;
		double pl=totalRevenue-price;
		return pl;

	}

	public double commodityRealizedPL() {
		double pl=0;
		return pl;
	}

	public double futureRealizedPL(float buyingPrice, float marketPrice,int quantity) {

		float differenceInPrice = marketPrice-buyingPrice;
		double pl=(differenceInPrice*quantity);
		return pl;
	}

	public double optionsRealizedPL(float strikePrice,  float marketPrice, Date expirationDate, float premium, int lotSize, String typeOfOption ) {

		double pl=0;
		if(typeOfOption.equals("CALL")) {
			double breakEvenPrice=strikePrice+premium;
			if(premium>0) {
				if(marketPrice>strikePrice) {
					double difference = marketPrice-strikePrice;
					if(difference>premium) {
						pl=(difference-premium)*lotSize;					}
					else {
						pl=-(premium-difference)*lotSize;
					}
				}
				else {
					pl=-premium;
				}
			}
			else {
				if(marketPrice>strikePrice) {
					double difference = marketPrice-strikePrice;
					if(difference>premium) {
						pl=-(difference-premium)*lotSize;					}
					else {
						pl=(premium-difference)*lotSize;
					}
				}
				else {
					pl=premium;
				}
			}

		}
		else if(typeOfOption.equals("PUT")) {
			double breakEvenPrice=strikePrice-premium;
			if(premium>0) {
				if(marketPrice<strikePrice) {
					double difference = strikePrice-marketPrice;
					if(difference>premium) {
						pl=(difference-premium)*lotSize;					}
					else {
						pl=-(premium-difference)*lotSize;
					}
				}
				else {
					pl=-premium;
				}
			}
			else {
				if(marketPrice<strikePrice) {
					double difference = marketPrice-strikePrice;
					if(difference>premium) {
						pl=-(difference-premium)*lotSize;					}
					else {
						pl=(premium-difference)*lotSize;
					}
				}
				else {
					pl=premium;
				}
			}
		}

		return pl;
	}

}
