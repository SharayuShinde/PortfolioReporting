package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Bond;
import com.pojo.Equity;
import com.pojo.Security;
import com.util.DBConnection;

public class EquityDAOImpl implements EquityDAO {

	@Override
	public Equity getEquity(String SecuritySymbol) {
		// TODO Auto-generated method stub
		Equity e = null;
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from equity where security_symbol=?");
			stmt.setString(1, SecuritySymbol);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				e = new Equity();
				e.setSecuritySymbol(rs.getString(1));
				e.setFaceValue(rs.getFloat(2));
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return e;
	}

	@Override
	public Equity updateEquity(Equity e, String SecuritySymbol) {
		// TODO Auto-generated method stub
		Equity equity = null;
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement(
					"UPDATE equity SET face_value=? where security_symbol=? ");
			stmt.setFloat(1, e.getFaceValue());
			stmt.setString(2, e.getSecuritySymbol());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				equity = getEquity(SecuritySymbol);
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		return equity;
	}

	@Override
	public Equity deleteEquity( String SecuritySymbol) {
		// TODO Auto-generated method stub
		Equity equity = getEquity(SecuritySymbol);
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("delete from equity where security_symbol=?");
			stmt.setString(1, SecuritySymbol);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return equity;
	}

	@Override
	public Equity addEquity(Equity e, Security s) {
		// TODO Auto-generated method stub
		Equity equity = null;
		SecurityDAO dao = new SecurityDAOImpl();
		dao.addSecurity(s);
		Connection con = DBConnection.createConnection();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("insert into equity values(?,?)");
			stmt.setString(1, e.getSecuritySymbol());
			stmt.setFloat(2, e.getFaceValue());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				equity = getEquity(e.getSecuritySymbol());
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

		return e;

	}

}
