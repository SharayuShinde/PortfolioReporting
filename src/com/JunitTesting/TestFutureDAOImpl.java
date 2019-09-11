package com.JunitTesting;
import com.pojo.*;
import com.dao.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class TestFutureDAOImpl {

	@Test
	void testGetFuture() throws ParseException {
//		fail("Not yet implemented");
		FutureDAO dao = new FutureDAOImpl();
		Future future = dao.getFuture("SBIN-FUT");
		System.out.println(future.getMaturity());
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
		 
		String dateInString = "26-Sep-2019";
		Date date =  formatter.parse(dateInString);
		
		assertEquals(date, future.getMaturity());
	}

	@Test
	void testUpdateFuture() {
//		fail("Not yet implemented");
	}

	@Test
	void testDeleteFuture() {
//		fail("Not yet implemented");
	}

	@Test
	void testAddFuture() {
//		fail("Not yet implemented");
	}

}
