package com.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.pojo.*;
import com.dao.*;

class TestTransactionDAOImpl {

	@Test
	void testGetTransactionByCustomerId() {
//		fail("Not yet implemented");
		TransactionDAO dao = new TransactionDAOImpl();
		List<Transaction> list = dao.getTransactionByCustomerId(111111);
		assertEquals(3, list.size());
		Transaction t = list.get(0);
		assertEquals(200, t.getQuantityOfTradedSecurity());
	}

	@Test
	void testUpdateTransaction() {
//		fail("Not yet implemented");
		TransactionDAO dao = new TransactionDAOImpl();
		
		Transaction t = dao.getTransactionByTransactionId("500005");
		Transaction transaction = dao.updateTransaction("200001", t);
		assertEquals(1000, transaction.getQuantityOfTradedSecurity());
		assertEquals("200001", transaction.getTransaction_id());
	}

//	@Test
//	void testDeleteTransaction() {
////		fail("Not yet implemented");
//		TransactionDAO dao = new TransactionDAOImpl();
//		Transaction t = dao.deleteTransaction("700007");
//		assertEquals(111111, t.getCustomer_id());
//	}

//	@Test
//	void testAddTransaction() {
////		fail("Not yet implemented");
//		TransactionDAO dao = new TransactionDAOImpl();
////		Transaction t = dao.getTransactionByTransactionId("100001");
////		t.setTransaction_id("700007");
////		Transaction t2 = dao.addTransaction(t);
////		assertEquals(140, t2.getQuantityOfTradedSecurity());
//		
//		Transaction transaction = new Transaction();
//		transaction.setCustomer_id(111111);
//		transaction.setQuantityOfTradedSecurity(1000);
//		transaction.setTransaction_id("700007");
//		Security s = new Security();
//		s.setSecuritySymbol("INFY-FUT");
//		s.setSecurityType("FUTURE");
//		SecurityDAO d = new SecurityDAOImpl();
//		d.addSecurity(s);
//		transaction.setSecurity(s);
//		Date date = new Date();
//		transaction.setTrade_date(date);
//		System.out.println(transaction);
//		Transaction t3 = dao.addTransaction(transaction);
//		System.out.println(t3);
//		assertEquals(1000, t3.getQuantityOfTradedSecurity());
//	}

	@Test
	void testGetTransactionByTransactionId() {
		TransactionDAO dao = new TransactionDAOImpl();
		Transaction t = dao.getTransactionByTransactionId("100001");
		assertEquals(111111, t.getCustomer_id());
	}
}
