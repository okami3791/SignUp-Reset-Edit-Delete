package com.ken.edit;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ken.user.UserData;
import com.ken.userdaos.copy.UserDAOS;

/**
 * Servlet implementation class EditLogin
 */
@WebServlet("/EditLogin")
public class EditLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UserData u = new UserData();
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); ;
		Session session=(Session) sf.openSession();
		session.beginTransaction();
		u =(UserData) session.get(UserData.class, request.getParameter("name"));
		
		HttpSession sess = request.getSession();
		sess.setAttribute("email", u.getEmail());
		sess.setAttribute("city", u.getCity());
		sess.setAttribute("last", u.getLast());
		sess.setAttribute("first", u.getFirst());
		sess.setAttribute("name", u.getName());
		sess.setAttribute("number", u.getNumber());
		
		session.getTransaction().commit();
		session.close();
		request.getRequestDispatcher("EditDetails.jsp").forward(request, response);
	}

}
