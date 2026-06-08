package days14;

/**
 * @author kenik
 * @date 2026. 5. 29. 오후 4:38:11
 * @subject 
 * @content 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		
		// JDBCDrvier  인터페이스
		// MySQLDriver 클래스
		// OracleDriver 클래스
		// MSSQLDriver 클래스
		
		JDBCDrvier con = new OracleDriver();
		con.open();
		
		con.select();
		con.insert();
		con.insert();
		con.insert();
		con.delete();
		con.update();		
		
		con.close();

	} // main

} // class







