package com.dao;


import com.pojo.Bond;
import com.pojo.Security;

public interface BondDAO {
	public Bond getBond(String SecuritySymbol);
	public Bond updateBond(Bond b,String SecuritySymbol);
	public Bond deleteBond(Bond b,String SecuritySymbol);
	public Bond addBond(Bond b,Security s);
}
