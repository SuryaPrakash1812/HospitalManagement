package com.hospitals;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosdao.Docdao;
import com.hosdao.Pharmadao;
import com.hosdao.Redao;
import com.model.Docmod;
import com.model.Pmod;
import com.model.Pregi;
import com.model.Remod;

@WebServlet("/")
public class Hospserv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher rd;
//	 int i=1;
	int cou=0;
	ArrayList<Pmod> pal;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path=request.getServletPath();
		switch(path)
		{
		case "/reLogoutfinal":
			reLogoutfinal(request,response);
		case "/relogout":
			reLogout(request,response);
			break;
		case "/phlogout":
		phLogout(request,response);
		break;
		case "/refreshp":
		
			getRefPh(request,response);
			break;
		case "/getph":
			getPhL(request,response);
			break;
		case "/pharma":
			ok1(request,response);
			break;
		case "/phver":
			phver(request,response);
			break;
		case "/back":
			get(request,response);
			break;
		case "/refresh":
		getRefresh(request,response);
		break;
		case "/save":
			save(request,response);
			break;
		case "/logout":
			logout(request,response);
			break;

		case"/dver":
			getDver(request,response);
			break;
		case "/hom":
			getregi(request,response);
			break;
		case "/reg":
			register(request,response);
			break;
		case "/ver":
			getVerify(request,response);
			break;
		case "/doc":
		getDocLogin(request,response);
		break;
		case "/ok":
			get(request,response);
			break;
		default:
		
			getTreat(request,response);
			break;
		}
		
	}
//reception logout
private void reLogoutfinal(HttpServletRequest request, HttpServletResponse response) {
	rd=request.getRequestDispatcher("login.jsp");
	try {
		rd.forward(request, response);
		
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}

private void reLogout(HttpServletRequest request, HttpServletResponse response) {
			
	try {
		response.sendRedirect("reLogoutfinal");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
//pharma logout
private void phLogout(HttpServletRequest request, HttpServletResponse response) {
	rd=request.getRequestDispatcher("Pharmlog.jsp");
	try {
		rd.forward(request, response);
		
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
	}
//pharma jsp
private void getRefPh(HttpServletRequest request, HttpServletResponse response) {
		try {
			 
			response.sendRedirect("pharma");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//pharma login page

private void getPhL(HttpServletRequest request, HttpServletResponse response) {
		rd=request.getRequestDispatcher("Pharmlog.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
private void ok1(HttpServletRequest request, HttpServletResponse response) {
	
	ArrayList<Pmod> phal=	Redao.display();

	rd=request.getRequestDispatcher("Pharma.jsp");
	try {
		request.setAttribute("phdisplay", phal);
		rd.forward(request, response);
		
	
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}


//verify pharma admin credentials
private void phver(HttpServletRequest request, HttpServletResponse response) {
	String phname=request.getParameter("phname");
	String phpassword=request.getParameter("phpassword");
	String status1=Pharmadao.verify(phname, phpassword);
	if(status1.equals("success"))
	{
		try {
			response.sendRedirect("pharma");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		rd=request.getRequestDispatcher("Pharmlog.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

// refresh page

private void getRefresh(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.sendRedirect("sde");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//save prescription
private void save(HttpServletRequest request, HttpServletResponse response) {
	int id=Integer.parseInt(request.getParameter("id"));
	String pres=request.getParameter("pres");
	int count=Docdao.save(id, pres);
			if(count>0)
			{
		rd=request.getRequestDispatcher("Pres.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
			else
			{
				System.out.println("error");
			}
}
	
//logout doctor
private void logout(HttpServletRequest request, HttpServletResponse response) {
//	rd=request.getRequestDispatcher("dlogout.jsp");
	rd=request.getRequestDispatcher("Doclogin.jsp");
	try {
		rd.forward(request, response);
		
	} catch (ServletException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	}

private void getTreat(HttpServletRequest request, HttpServletResponse response) {
	try {
		pal=Redao.display();
					response.sendRedirect("ok");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
//treatment page
	private void get(HttpServletRequest request, HttpServletResponse response) {
		
		
		 rd=request.getRequestDispatcher("treatement.jsp");
		try {
			request.setAttribute("dispat", pal);
			rd.forward(request, response);
			
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//verify doctor credentials
	private void getDver(HttpServletRequest request, HttpServletResponse response) {
		String duname=request.getParameter("duname");
		String dpassword=request.getParameter("dpassword");
		Docmod dm=new Docmod(duname, dpassword);
	
	String stat=Docdao.dverify(dm);
	if(stat.equals("success"))
	{
		
		try {

			response.sendRedirect("defa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	else
	{
		rd=request.getRequestDispatcher("Doclogin.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	}
	//patient registration page
	private void getregi(HttpServletRequest request, HttpServletResponse response) {
		RequestDispatcher rd=request.getRequestDispatcher("patientregi.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
private void register(HttpServletRequest request, HttpServletResponse response) {
		String pname=request.getParameter("pname");
		String pbg=request.getParameter("pbg");
		int page=Integer.parseInt(request.getParameter("pag"));
		String paddress=request.getParameter("paddress");
		String pgender=request.getParameter("pgender");
		String pdob=request.getParameter("pdob");
		Long pnumber=Long.parseLong(request.getParameter("pmobile"));
		Pregi pr=new Pregi(pname, pbg, page, paddress, pgender, pdob, pnumber);
		int count=Redao.insertt(pr);
		if(count>0)
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("sucess.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("patientregi.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//verify reception credentials
	private void getVerify(HttpServletRequest request, HttpServletResponse response) {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		Remod red = new Remod(uname, password);
		String status=Redao.pverify(red);
		if(status.equals("sucess"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("patientregi.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	//doctor login page
	private void getDocLogin(HttpServletRequest request, HttpServletResponse response) {
		rd=request.getRequestDispatcher("Doclogin.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void getLogin(HttpServletRequest request, HttpServletResponse response) {
		
		 rd=request.getRequestDispatcher("login.jsp");
			try {
				rd.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
