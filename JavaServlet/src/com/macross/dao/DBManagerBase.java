package com.macross.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.macross.model.Varitech;

public class DBManagerBase {

	public static void insertVaritechData(Varitech varitech) {
		Connection connection = null;

		try {
			ConnectionRobotech rc = new ConnectionRobotech();
			connection = rc.getConnection();

		} catch (Exception error) {
			error.printStackTrace();
		}

		try {

			if (connection != null) {
				PreparedStatement ps;
				String sql = "INSERT INTO varitechsquadron(hours, model, base, autonomy) VALUES(?,?,?,?)";
				ps = connection.prepareStatement(sql);
				ps.setBigDecimal(1, varitech.getHours());
				ps.setString(2, varitech.getModel());
				ps.setString(3, varitech.getBase());
				ps.setBigDecimal(4, varitech.getAutonomy());
				ps.executeUpdate();
				ps.close();

				System.out.println("Insercción ok");

			} else {

			}

		} catch (Exception error) {
			error.printStackTrace();
		}

	}

	public static ArrayList<Varitech> retriveAllVaritech() throws SQLException {

		ArrayList<Varitech> vcVaritech = new ArrayList<Varitech>();
		Connection connection = null;

		try {
			ConnectionRobotech rc = new ConnectionRobotech();
			connection = rc.getConnection();

		} catch (Exception error) {
			error.printStackTrace();
		}

		Statement st;
		String sql = "SELECT hours, model, base, autonomy FROM varitechsquadron";
		st = connection.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			BigDecimal hours = rs.getBigDecimal(1);
			String model = rs.getString(2);
			String base = rs.getString(3);
			BigDecimal autonomy = rs.getBigDecimal(4);
			vcVaritech.add(new Varitech(hours, model, base, autonomy));

		}
		return vcVaritech;
	}

	public static Varitech retriveVaritech(int id) {

		Varitech varitech = new Varitech();

		try {

			ArrayList<Varitech> vcVaritech = DBManagerBase.retriveAllVaritech();
			for (int i = 0; i < vcVaritech.size(); i++) {

				varitech = vcVaritech.get(id);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return varitech;
	}

}
