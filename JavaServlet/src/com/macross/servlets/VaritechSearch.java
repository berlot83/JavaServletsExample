package com.macross.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.macross.dao.DBManagerBase;
import com.macross.model.Varitech;

/**
 * Servlet implementation class VaritechSearch
 */
@WebServlet("/VaritechSearch")
public class VaritechSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VaritechSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "/varitechAdmin.jsp";

		try {

		} catch (Exception error) {
			error.printStackTrace();
		}
		getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "/varitechAdmin.jsp";
		
		try{
			String id = request.getParameter("id");

			Varitech varitech = DBManagerBase.retriveVaritech(Integer.parseInt(id));
			request.setAttribute("varitech", varitech);
		}catch(Exception error){
			error.printStackTrace();
		}
		getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);

	}

}
