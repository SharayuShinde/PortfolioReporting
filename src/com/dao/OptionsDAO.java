package com.dao;

import com.pojo.Options;
import com.pojo.Security;

public interface OptionsDAO {
	public Options getOptions(String SecuritySymbol);
	public Options updateOptions(Options o,String SecuritySymbol);
	public Options deleteOptions(Options o,String SecuritySymbol);
	public Options addOptions(Options o,Security s);
}
