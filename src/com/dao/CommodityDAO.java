package com.dao;


import com.pojo.Commodity;
import com.pojo.Security;

public interface CommodityDAO {
	public Commodity getCommodity(String SecuritySymbol);
	public Commodity updateCommodity(Commodity e,String SecuritySymbol);
	public Commodity deleteCommodity(Commodity e,String SecuritySymbol);
	public Commodity addCommodity(Commodity e,Security s);
}
