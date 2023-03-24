package com.hosdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Pmod;

public class Pharmadao {
	static String result=null;
	static String url="jdbc:mysql://localhost:3306/hospital";
	static String usname="root";
	static String passw="admin";
	static int count;
	static Connection con=null;
	//verify pharma admin credentials
	public static String verify(String phname,String phpassword)
	{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,usname,passw);
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from pharma");
			while(rs.next())
			{
				String phuname=rs.getString("phname");
				String password=rs.getString("phpassword");
				if(phuname.equals(phname) && password.equals(phpassword))
				{
					return "success";
				
				}
								}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "failure";
		
	}
}

