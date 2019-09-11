package com.JunitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.dao.*;
import com.pojo.*;
class TestCustomerDAOImpl {
 
	@Test
	void testGetCustomerByID() {
//		fail("Not yet implemented");
		CustomerDAO dao = new CustomerDAOImpl();
//		dao = new CustomerDAOImpl();
		Customer customer = dao.getCustomerByID(222222);
//		assertEquals("Mukesh Rai", customer.getFullname());
		assertEquals("Male", customer.getGender());
	}

	@Test
	void testUpdateCustomer() {
//		fail("Not yet implemented");
		CustomerDAO dao = new CustomerDAOImpl();
//		dao = new CustomerDAOImpl();
		Customer customer =  dao.getCustomerByID(333333);
		Customer customer2 = dao.updateCustomer(111111, customer);
		assertEquals("Seema Jai", customer2.getFullname());
	}
 
	@Test
	void testDeleteCustomer() {
//		fail("Not yet implemented");
		CustomerDAO dao = new CustomerDAOImpl();
		Customer customer = dao.deleteCustomer(444444);
		assertEquals(555555, customer.getCustomer_id());
	}

//	@Test
//	void testAddCustomer() {
////		fail("Not yet implemented");
//		CustomerDAO dao = new CustomerDAOImpl();
//		Customer customer = dao.getCustomerByID(222222);
//		System.out.println(customer);
//		customer.setCustomer_id(555555);
//		Customer customer2 = dao.addCustomer(customer);
//		assertEquals(customer.getCustomer_id(), customer2.getCustomer_id());
//	}

}
