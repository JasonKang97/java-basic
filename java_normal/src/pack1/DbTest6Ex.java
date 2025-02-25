package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DbTest6Ex {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	String jik;
	public DbTest6Ex() {
		dbLoad();
		insertData();
		showData();
	}

	public void dbLoad() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("Load err:" + e.getMessage());
			System.exit(0);
		}
	}

	private void insertData() {
		try {
			conn=DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
			Scanner scan = new Scanner(System.in);
			System.out.print("직급 입력: ");
			jik = scan.next();
			scan.close();

		} catch (Exception e) {
			System.out.println("Insert err:" + e.getMessage());
			System.exit(0);
		}finally {
			try {
				if (conn != null) conn.close();
			} catch (Exception e2) {

			}
		}
	}

	private void showData() {
		try {
			conn=DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
			pstmt=conn.prepareStatement("select jikwonno, jikwonname, busername, jikwonjik, jikwongen from jikwon left outer join buser on busernum=buserno where jikwonjik=?");
			pstmt.setString(1, jik);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString("jikwongen"));
			}
			
			pstmt=conn.prepareStatement("select count(*) from jikwon where jikwonjik=?");
			pstmt.setString(1, jik);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("인원 수: " + rs.getString(1));
			}

			
		} catch (Exception e) {
			System.out.println("Show err:" + e.getMessage());
			System.exit(0);
		}finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {

			}
		}
	}

	public static void main(String[] args) {
		new DbTest6Ex();
	}
}
