package com.JunitTesting;
import com.dao.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import com.pojo.*;
class TestOptionsDAOImpl {

	@Test
	void testGetOptions() {
//		fail("Not yet implemented");
		OptionsDAO dao = new OptionsDAOImpl();
		Options options = dao.getOptions("YESBANK-OPT");
		assertEquals(100.0F, options.getPremium());
		assertEquals(70.0F, options.getStrikePrice());
	}

	@Test
	void testUpdateOptions() {
//		fail("Not yet implemented");
	}

	@Test
	void testDeleteOptions() {
//		fail("Not yet implemented");
	}

	@Test
	void testAddOptions() {
//		fail("Not yet implemented");
	  Options options = new Options();
	  options.setSecuritySymbol("SBIN-OPT");
	  options.setLotSize(150);
	  options.setPremium(120.0F);
	  options.setSecurityType("OPTION");
	  Date date = new Date();
	  System.out.println(date);
	  options.setExpirationDate(date);
	  OptionsDAO dao = new OptionsDAOImpl();
	  Security s = new Security();
	  s.setSecuritySymbol(options.getSecuritySymbol());
	  s.setSecurityType(options.getSecurityType());
	  Options o = dao.addOptions(options, s);
	  assertEquals(150, o.getLotSize());
	}

}
