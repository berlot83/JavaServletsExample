package com.macross.servlets;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.macross.dao.DBManagerBase;
import com.macross.model.Varitech;

/**
 * Servlet implementation class TakeOff
 */
@WebServlet("/TakeOff")
public class TakeOff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TakeOff() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/takeOff.jsp";
		
		try{
			
			
			
		}catch(Exception error){
			error.printStackTrace();
		}
		getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/index.jsp";
		
		try{
		
			String id = request.getParameter("id");
			String flightHours =request.getParameter("flightHours");
			String model = request.getParameter("model");
			String base = request.getParameter("base");
			String autonomy = request.getParameter("autonomy");
			
			Varitech varitech = new Varitech(new BigDecimal(flightHours), model, base, new BigDecimal(autonomy));
			DBManagerBase.insertVaritechData(varitech);
			
			System.out.println(id);
			System.out.println(flightHours);
			System.out.println(model);
			System.out.println(base);
			System.out.println(autonomy);
			
		}catch(Exception error){
			error.printStackTrace();
		}
		getServletConfig().getServletContext().getRequestDispatcher(url).forward(request, response);
		
		
	}

}
