package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbTest2 {
	private Connection conn=null;
	private Statement stmt=null;
	private ResultSet rs=null;
		
	public DbTest2() {
		// 1) JDBC 업체가 제공하는 Driver 파일 로딩
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("1)에서 에러발생: " + e.getMessage());
			return;
		}
		
		// 2) DB 서버와 연결
		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
		} catch (Exception e) {
			System.out.println("2)에서 에러발생: " + e.getMessage());
			return;
		}
		
		// 3) SQL문 실행: select로 자료 읽기
		try {
			stmt=conn.createStatement();
			String sql1 = "select jikwonno, jikwonname, jikwonjik, busername from jikwon left outer join buser on buserno=busernum where jikwonjik in('사원', '대리');";
			rs=stmt.executeQuery(sql1);
			while(rs.next()) {
				String jikwonno =rs.getString(1);
				String jikwonname =rs.getString(2);
				String jikwonjik =rs.getString(3);
				String busername =rs.getString(4);
				System.out.println(jikwonno + "\t" + jikwonname + "\t" + jikwonjik + "\t" + busername);
			}
			rs=stmt.executeQuery("select count(jikwonno) from jikwon where jikwonjik in('사원', '대리');");
			rs.next();
			System.out.println("직원수: " + rs.getInt(1));
		} catch (Exception e) {
			System.out.println("3)에서 에러발생: " + e.getMessage());
			return;
		}
		finally {	// 에러의 유무와 상관없이 실행됨
			try {
				if(rs!=null) rs.close();			
				if(stmt!=null) stmt.close();			
				if(conn!=null) conn.close();			
			} catch (Exception e2) {

			}
		}
		
		
	}
	
		
	public static void main(String[] args) {
		new DbTest2();

	}

}
