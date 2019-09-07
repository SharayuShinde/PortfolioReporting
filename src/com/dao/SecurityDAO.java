package com.dao;

import com.pojo.Security;

public interface SecurityDAO {

	public Security getSecurityBySecuritySymbol(String SecuritySymbol);
	public Security updateSecurity(String SecuritySymbol);
	public Security deleteSecurity(String SecuritySymbol);
	public Security addSecurity(Security s);

}
