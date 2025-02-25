package pack3lambda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.Consumer;

public class MyLambda5db {
	//private Connection conn;
	//private PreparedStatement pstmt;
	//private ResultSet rs;
	public MyLambda5db() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("로딩 실패: " + e);
		}
		
		System.out.println("처리1");
		String sql = "select * from sangdata";
		queryDb(sql, rs ->{
			try {
				System.out.println("처리3");
				while(rs.next()) {
					System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
				}
			} catch (Exception e) {
				System.out.println("er: " + e);
			}
		});
	}
	
	private void queryDb(String sql, Consumer<ResultSet> consumer) {
		// try - with - resources 문법 사용해 try문에 매개변수를 적용.
		// 매개변수 객체는 자동 close()된다.
		try (
			Connection conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()
			){
			System.out.println("처리2");
				consumer.accept(rs);
			System.out.println("처리4");

		} catch (Exception e) {
			System.out.println("queryDb err: " + e);
		}
	}
	
	public static void main(String[] args) {
		new MyLambda5db();
	}
}
