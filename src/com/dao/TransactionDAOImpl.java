package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Price;
import com.pojo.Security;
import com.pojo.Transaction;
import com.util.DBConnection;

public class TransactionDAOImpl implements TransactionDAO {

	@Override
	public List<Transaction> getTransactionByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		List<Transaction> list = new ArrayList<Transaction>();
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from transaction where customer_id=?");
			stmt.setInt(1, customerId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Transaction t = new Transaction();
				t.setCustomer_id(rs.getInt(1));
				t.setTrade_date(rs.getDate(2));
				String securitySymbol = rs.getString(3);
				SecurityDAO dao = new SecurityDAOImpl();
				Security s = dao.getSecurityBySecuritySymbol(securitySymbol);
				t.setSecurity(s);
				t.setQuantityOfTradedSecurity(rs.getInt(4));
				t.setTransaction_id(rs.getString(5));
				list.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public Transaction updateTransaction(String transactionid, Transaction newtransaction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction deleteTransaction(String transactionid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction addTransaction(Transaction transaction) {
		// TODO Auto-generated method stub
		return null;
	}

}
