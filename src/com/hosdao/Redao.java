package com.hosdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Pmod;
import com.model.Pregi;
import com.model.Remod;

import sun.net.www.content.text.plain;



public class Redao {
	static String result=null;
	static String url="jdbc:mysql://localhost:3306/hospital";
	static String usname="root";
	static String passw="admin";
	static int count;
	static Connection con=null;
	static ArrayList<Pmod> pal= new ArrayList<Pmod>();

	public static String pverify(Remod red)
	{
		
	
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url,usname,passw);
				Statement s=con.createStatement();
				ResultSet rs=s.executeQuery("select * from reception");
				while(rs.next())
				{
					String uname=rs.getString("uname");
					String password=rs.getString("password");
					if(uname.equals(red.getUname()) && password.equals(red.getPassword()))
					{
						return "sucess";
					
					}
									}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return "failure";
	
	
		}
	public static int insertt(Pregi pr)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,usname,passw);
		PreparedStatement ps= con.prepareStatement("insert into patient(pname,pbg,page,padress,pgender,pdob,pmobile) values(?,?,?,?,?,?,?)");
		ps.setString(1, pr.getPname());
		ps.setString(2, pr.getPbg());
		ps.setInt(3,pr.getPage());
		ps.setString(4,pr.getPaddress());
		ps.setString(5, pr.getPgender());
		ps.setString(6, pr.getPdob());
		ps.setLong(7, pr.getPnumber());
	count=	ps.executeUpdate();
		ps.close();
		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	public  static ArrayList<Pmod> display()
	{

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,usname,passw);
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from patient");
			while(rs.next())
			{
			int pid=rs.getInt("pid");
			String pname=rs.getString("pname");
			String pbg =rs.getString("pbg");
			int page=rs.getInt("page");
			String presc=rs.getString("prescription");
			Pmod pm=new Pmod(pid, pname, pbg, page,presc);
			
			pal.add(pm);
				
								}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		return pal;
		
	}

}
