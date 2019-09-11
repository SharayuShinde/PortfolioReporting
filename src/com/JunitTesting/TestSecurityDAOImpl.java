package com.JunitTesting;
import com.dao.*;
import com.pojo.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSecurityDAOImpl {

	@Test
	void testGetSecurityBySecuritySymbol() {
//		fail("Not yet implemented");
		SecurityDAO dao = new SecurityDAOImpl();
		Security security = dao.getSecurityBySecuritySymbol("SBIN-FUT");
		assertEquals("FUTURE", security.getSecurityType());
	}

	@Test
	void testUpdateSecurity() {
//		fail("Not yet implemented");
		
	}

//	@Test
//	void testDeleteSecurity() {
////		fail("Not yet implemented");
//		SecurityDAO dao = new SecurityDAOImpl();
//		Security security = dao.deleteSecurity("WIPRO-EQ");
//		assertEquals("EQUITY", security.getSecurityType());
//		System.out.println("DELETING");
//	}

	@Test
	void testAddSecurity() {
//		fail("Not yet implemented");
		SecurityDAO dao = new SecurityDAOImpl();
		Security s = new Security();
		s.setSecuritySymbol("JSWSTEEL-FUT");
		s.setSecurityType("FUTURE");
		Security security =  dao.addSecurity(s);
		System.out.println("ADDING");
		assertEquals("FUTURE", security.getSecurityType());
		assertEquals("JSWSTEEL-FUT", security.getSecuritySymbol());
	}

}
