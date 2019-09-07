package com.dao;

import com.pojo.Equity;
import com.pojo.Security;

public interface EquityDAO {
	public Equity getEquity(String SecuritySymbol);
	public Equity updateEquity(Equity e,String SecuritySymbol);
	public Equity deleteEquity(Equity e,String SecuritySymbol);
	public Equity addEquity(Equity e,Security s);
}
