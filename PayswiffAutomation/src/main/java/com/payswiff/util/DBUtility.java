/**
 *
 * @author Sai G
 */
package com.payswiff.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {
	
private static Statement stmt;

/*public static void  main(String[] args) throws  ClassNotFoundException, SQLException {		
	
	
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    String dbUrl = "jdbc:mysql://192.168.1.12:3306/";					

	//Database Username		
	String username = "chaitanya";	
    
	//Database Password		
	String password = "Chaitanya@123";				

	//Query to Execute		
	String query = "select COUNT(*) from pn_dwl_axis_party.merchant_t m, pn_dwl_axis_party.merchant_activation_info_t mai, pn_dwl_axis_party.party_paddrs_t adr,\n" + 
			"pn_dwl_axis_party.merchant_onboard_info_t onbrd\n" + 
			"where m.merchant_id = mai.party_id AND ack_verified = 1 and m.merchant_id = adr.party_id and adr.address_type= 1 and adr.is_active=1 \n" + 
			"and onbrd.merchant_id = m.merchant_id and onbrd.merchant_is_exist = 'N' and m.status= 'Active' and m.org_id =2 ;";	
    
	    //Load mysql jdbc driver		
	    Class.forName("com.mysql.jdbc.Driver");			

		//Create Connection to DB		
	Connection con = DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
   Statement stmt = con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);				
		

		// While Loop to iterate through all data and print results	
		while (rs.next()) {
			
			int count = rs.getInt(1);
			System.out.println(count);
		}
		 // closing DB Connection		
		con.close();			
}*/

public static void DBCreation() throws ClassNotFoundException, SQLException {
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    String dbUrl = "jdbc:mysql://192.168.1.12:3306/";					

	//Database Username		
	String username = "chaitanya";	
    
	//Database Password		
	String password = "Chaitanya@123";		
	
	//Load mysql jdbc driver		
    Class.forName("com.mysql.jdbc.Driver");			

	//Create Connection to DB		
   Connection con = DriverManager.getConnection(dbUrl,username,password);

	//Create Statement Object		
   stmt = con.createStatement();					
	
}

//Active Merchants Query
public static int Active_Merch_Query() throws SQLException {
	
	int count = 0;
	//Query to Execute		
	String query = "select COUNT(*) from pn_dwl_axis_party.merchant_t m, pn_dwl_axis_party.merchant_activation_info_t mai, pn_dwl_axis_party.party_paddrs_t adr,\n" + 
			"pn_dwl_axis_party.merchant_onboard_info_t onbrd\n" + 
			"where m.merchant_id = mai.party_id AND ack_verified = 1 and m.merchant_id = adr.party_id and adr.address_type= 1 and adr.is_active=1 \n" + 
			"and onbrd.merchant_id = m.merchant_id and onbrd.merchant_is_exist = 'N' and m.status= 'Active' and m.org_id =2 ;";	
	
	ResultSet rs= stmt.executeQuery(query);
	
	while (rs.next()) {
		
	 count = rs.getInt(1);
	 System.out.println("Count of Active Merchants is :" +count );
	}
	return count;

}

//Result Modifier to match db result
public static String ResultModifier(String str) {
	
	String mod_Str = str.replaceAll(" ","");
	System.out.println("Modified Str: " +mod_Str);
	
	String newStr = deleteCharAt(mod_Str, 0);
	String newStr1 = deleteCharAt(newStr, 0);
	String newStr2 = deleteCharAt(newStr1, 0);
	String newStr3 = deleteCharAt(newStr2, 0);
	String newStr4 = deleteCharAt(newStr3, 0);
	String newStr5 = deleteCharAt(newStr4, 0);
	String newStr6 = deleteCharAt(newStr5, 0);
	String newStr7 = deleteCharAt(newStr6, 0);
	String newStr8 = deleteCharAt(newStr7, 0);
	String newStr9 = deleteCharAt(newStr8, 0);
	String newStr10 = deleteCharAt(newStr9, 0);
	String newStr11 = deleteCharAt(newStr10, 0);
	String newStr12 = deleteCharAt(newStr11, 0);
	String newStr13 = deleteCharAt(newStr12, 0);
	
	System.out.println("New Str: "+newStr13);
	return newStr13;
}

//To Delete the Space between String
private static String deleteCharAt(String strValue, int index) {
	return strValue.substring(0, index) + strValue.substring(index + 1);

}

}