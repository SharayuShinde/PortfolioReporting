package com.dao;


import com.pojo.Price;
import com.pojo.Security;

public interface PriceDAO {
	public Price getPrice(String SecuritySymbol);
	public Price updatePrice(Price p,String SecuritySymbol);
	public Price deletePrice(Price p,String SecuritySymbol);
	public Price addPrice(Price p,Security s);
}
