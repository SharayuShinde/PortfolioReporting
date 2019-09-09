package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Bond;
import com.pojo.Future;
import com.pojo.Security;
import com.util.DBConnection;

public class FutureDAOImpl implements FutureDAO {

	@Override
	public Future getFuture(String SecuritySymbol) {
		// TODO Auto-generated method stub
		Future f = null;
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from future where security_symbol=?");
			stmt.setString(1, SecuritySymbol);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				f = new Future();
				f.setSecuritySymbol(rs.getString(1));
				f.setMaturity(rs.getDate(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	@Override
	public Future updateFuture(Future f, String SecuritySymbol) {
		// TODO Auto-generated method stub
		Future future = null;
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(
					"UPDATE future SET maturity=? where security_symbol=?");
			stmt.setDate(1, (Date) f.getMaturity());
			stmt.setString(2, f.getSecuritySymbol());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				future = getFuture(SecuritySymbol);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return future;
	}

	@Override
	public Future deleteFuture(String SecuritySymbol) {
		// TODO Auto-generated method stub
		Future future = getFuture(SecuritySymbol);
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("delete from future where security_symbol=?");
			stmt.setString(1, SecuritySymbol);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return future;
	}

	@Override
	public Future addFuture(Future f, Security s) {
		// TODO Auto-generated method stub
		Future future = null;
		SecurityDAO dao = new SecurityDAOImpl();
		dao.addSecurity(s);
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into future values(?,?)");
			stmt.setString(1, f.getSecuritySymbol());
			stmt.setDate(2, (Date) f.getMaturity());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				future = getFuture(f.getSecuritySymbol());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return f;
	}

}
