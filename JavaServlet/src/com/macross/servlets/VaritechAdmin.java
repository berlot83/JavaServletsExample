package com.macross.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.macross.dao.DBManagerBase;
import com.macross.model.Varitech;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VaritechAdmin
 */
@WebServlet("/VaritechAdmin")
public class VaritechAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VaritechAdmin() {
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

		try {

			ArrayList<Varitech> vcVaritech = new ArrayList<Varitech>();
			vcVaritech = DBManagerBase.retriveAllVaritech();
			request.setAttribute("vcVaritech", vcVaritech);


		} catch (Exception error) {
			error.printStackTrace();
		}
		getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);

		
	}

}
