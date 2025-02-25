package pack1;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbTest3ex {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	private Properties properties = new Properties();

	public DbTest3ex() {
		try {
			properties.load(new FileInputStream("c:/work/jsou/java_normal/src/pack1/dbinfo.properties"));
			Class.forName(properties.getProperty("driver"));
			conn = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"),
					properties.getProperty("passwd"));
			dbProcess();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}
	}

	private void dbProcess() {
		try {
			String sql = "select jikwonjik, sum(jikwonpay), avg(jikwonpay) from jikwon where jikwonjik not in('이사', '부장') and jikwonpay is not null group by jikwonjik";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("직급" + "\t" + "연봉합" + "\t" + "연봉평균");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		new DbTest3ex();
	}

}
