package booksys.application.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	String driver = "org.mariadb.jdbc.Driver";
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public boolean Login(String chid, String chpw) {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/booksys", "root", "rkskek12");

			if (con != null) {
				System.out.println("DB 접속 성공");
			}

			String en = "enc_key";
			String qu = "select id, AES_DECRYPT(pw, SHA2('" + en + "',512)) FROM login";

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(qu);
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("AES_DECRYPT(pw, SHA2('" + en + "',512))");

				if (id.equals(chid) && pw.equals(chpw)) {
					return true;
				}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}

		return false;

	}
}
