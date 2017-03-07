package com.ken.del;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ken.userdaos.copy.UserDAOS;

/**
 * Servlet implementation class DeleteUSer
 */
@WebServlet("/DeleteUSer")
public class DeleteUSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUSer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDAOS ud= new UserDAOS();
	    ud.deleteUser(request.getParameter("name"));
	    request.getRequestDispatcher("DeleteSuccess.jsp").forward(request, response);
	}

}
