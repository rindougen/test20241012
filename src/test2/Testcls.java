package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import org.junit.Test;

import jp.co.mylib.TestCls;

public class Testcls{
	public static void main(String[] args) throws Exception {
//		connDB3();
		
		int c = TestCls.add(1,2);
	}
	
	static void testins() throws Exception{
		var conn = connDB3();
		var ps = conn.prepareStatement("insert into tbl_a values(?,?)");
		ps.setInt(1, 1);
		ps.setString(2, "a1");
		ps.execute();
		ps.close();
		conn.close();
	}
	
	static Connection connDB3() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "admin");
	}
	
	private static void connDB2() throws Exception {
		
		Class cz = Class.forName("oracle.jdbc.OracleDriver");
//		Driver d = (Driver)cz.newInstance();
		Driver d = (Driver)cz.getDeclaredConstructor().newInstance();
		
		//
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		Properties info = new Properties();
		info.setProperty("user", "system");
		info.setProperty("password", "admin");
		Connection conn = d.connect(url, info);
		pr(conn);
	}
	
	private static void connDB1() throws SQLException {
		Driver d = new oracle.jdbc.OracleDriver();
		//
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		Properties info = new Properties();
		info.setProperty("user", "system");
		info.setProperty("password", "admin");
		Connection conn = d.connect(url, info);
		pr(conn);
	}
	@Test
	public void test1() throws IOException, SQLException {
		
	}	
		
	static void  pr(Object o) {System.out.println(o);}
}