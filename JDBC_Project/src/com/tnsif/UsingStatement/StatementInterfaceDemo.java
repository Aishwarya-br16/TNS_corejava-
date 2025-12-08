package com.tnsif.UsingStatement; 

import java.beans.Statement; 
import java.sql.Connection; 
import java.sql.SQLException;

public class StatementInterfaceDemo { 
	static Connection cn; 
	static Statement st; 
	static { 
		cn = DBUtil.getConn(); 
		try { 
			st = (Statement) cn.createStatement(); 
		} 
		catch (SQLException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
		} 
	} 
	
	public static int addStudent () {  
		int n = 0; 
		try { 
			String query = "INSERT INTO employee.employee values (5|, 'Veena')"; 
			n = st.executeUpdate (query) ;
		} 
		catch (SQLException e) I{ 
			System.out.println("Error .... " + e.getMessage ()); 
			n = 0; 
		} 
		return n; 
	} 

	public static void closeConnection () { 
		try { 
			st.close(); 
			cn.close(); 
		} 
		catch (SQLException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace (); 
		} 
	}
}