package booksys.application.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Teamview {
	String driver = "org.mariadb.jdbc.Driver";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public ArrayList reservationview(String datedisplay) {

		ArrayList<String> reservationlist = new ArrayList<String>();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/booksys", "root", "rkskek12");

			if (con != null) {
				System.out.println("DB 접속 성공");
			}

			String reservationsql = "SELECT * FROM reservation WHERE DATE = '" + datedisplay + "'";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(reservationsql);
			while (rs.next()) {
				int oid = rs.getInt(1);
				int covers = rs.getInt(2);
				String date = rs.getString(3);
				String time = rs.getString(4);
				int table_id = rs.getInt(5);
				int customer_id = rs.getInt(6);

				String result = covers + "," + table_id;
				reservationlist.add(result);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}

		return reservationlist;

	}

	public ArrayList walkview(String datedisplay) {

		ArrayList<String> walklist = new ArrayList<String>();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/booksys", "root", "rkskek12");

			if (con != null) {
				System.out.println("DB 접속 성공");
			}

			String walkinsql = "SELECT * FROM walkin WHERE DATE = '" + datedisplay + "'";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(walkinsql);
			while (rs.next()) {
				int oid = rs.getInt(1);
				int covers = rs.getInt(2);
				String date = rs.getString(3);
				String time = rs.getString(4);
				int table_id = rs.getInt(5);

				String result2 = covers + "," + table_id;
				walklist.add(result2);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}

		return walklist;

	}
}
