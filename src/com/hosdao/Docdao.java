package com.hosdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.hospitals.Hospserv;
import com.model.Docmod;
import com.model.Pmod;
import com.model.Remod;

public class Docdao {
	static String result=null;
	static String url="jdbc:mysql://localhost:3306/hospital";
	static String usname="root";
	static String passw="admin";
	static int count;
	static Connection con=null;
//Verify doctor credentials
	public static String dverify(Docmod dm)
	{

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url,usname,passw);
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from doctor");
				while(rs.next())
				{
					String uname=rs.getString("duname");
					String password=rs.getString("dpassword");
					if(uname.equals(dm.getDuname()) && password.equals(dm.getDpassword()))
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
	//save the prescription
	public static int save(int id,String pres)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,usname,passw);
		PreparedStatement ps= con.prepareStatement("update patient set prescription=? where pid=?");
		ps.setString(1, pres);
		ps.setInt(2, id);
	count=	ps.executeUpdate();
	ps.close();
	con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
		
	}
	}



