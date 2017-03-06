package com.ken.edit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ken.user.UserData;
import com.ken.userdaos.copy.UserDAOS;

/**
 * Servlet implementation class EditServ
 */
@WebServlet("/EditServ")
public class EditServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
	    String pass = request.getParameter("pass");
	    String email =  request.getParameter("email");
	    String first = request.getParameter("first");
	    String last =  request.getParameter("last");
	    String city = request.getParameter("city");
	    String number = request.getParameter("number");
	   
		
	    UserData u = new UserData();
	    
	   
	    u.setPass(pass);
	    u.setCity(city);
	    u.setEmail(email);
	    u.setFirst(first);
	    u.setLast(last);
	    u.setNumber(number);
	    
	    UserDAOS ud= new UserDAOS();
	    ud.updateUser(u);
	    request.getRequestDispatcher("EditSuccess.jsp").forward(request, response);
	}

}
