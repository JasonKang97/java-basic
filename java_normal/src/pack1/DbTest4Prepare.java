package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// PreparedStatement: 선 처리 방식
// 동일한 SQL문을 여러 클라이언트가 빈번하게 사용할 경우 효과적(웹 프로그래밍)
// ? 연산자를 사용하여 보안을 강화하고 가독성을 향상시킬 수 있다.
public class DbTest4Prepare {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public DbTest4Prepare() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/test", "root", "123");
		} catch (Exception e) {
			System.out.println("로딩 실패: " + e.getMessage());
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			System.exit(0);
		}

	}

	public void dbProcdss() {
		// 전체 자료 읽기
		try {
			// 자료 추가
/*			String isqul = "insert into sangdata values(?,?,?,?)";
			pstmt = conn.prepareStatement(isqul);
			pstmt.setString(1, "5");
			pstmt.setString(2, "카페라떼");
			pstmt.setString(3, "6");
			pstmt.setInt(4, 6000);
			
			int re = pstmt.executeUpdate();
			if(re==1) {
				System.out.println("추가 성공");
			}
			else {
				System.out.println("추가 실패");
			}
*/		
			// 자료 수정
/*			String usql="update sangdata set sang=?, su=?, dan=? where code=?";
			pstmt = conn.prepareStatement(usql);
			pstmt.setString(1, "초코모카");
			pstmt.setInt(2, 11);
			pstmt.setInt(3, 5500);
			pstmt.setInt(4, 5);
			if(pstmt.executeUpdate()>0) {
				System.out.println("수정 성공");
			}
			else {
				System.out.println("수정 실패");
			}
 */
			// 자료 삭체
			String usql="delete from sangdata where code=?";
			pstmt = conn.prepareStatement(usql);
			pstmt.setString(1, "5");
			
			if(pstmt.executeUpdate()>0) {
				System.out.println("삭제 성공");
			}
			else {
				System.out.println("삭제 실패");
			}
			
			
			String sql = "select * from sangdata";
			pstmt = conn.prepareStatement(sql); // 선처리 방식
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
			System.out.println();
			// 부분 자료 읽기
			String co = "3";
			//sql = "select * from sangdata where code =" + co;	// 문자열 더하기: 시큐어 코딩 가이드에 위배됨. SQL Injection 공격에 취약함.
			sql = "select * from sangdata where code =?";
			pstmt = conn.prepareStatement(sql); // 선처리 방식
			pstmt.setString(1, co);	// 1번째 물음표에 co 변수 값을 연결(매핑)
			
			
			rs = pstmt.executeQuery();
			if(rs.next()) {	// 1개의 데이터만 읽을 경우 if를 사용한다.
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			System.out.println("읽기 완료");
			
			
		} catch (Exception e) {
			System.out.println("실패 원인: " + e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {

			}
		}

	}

	public static void main(String[] args) {
		DbTest4Prepare obj = new DbTest4Prepare();
		obj.dbProcdss();

	}

}
