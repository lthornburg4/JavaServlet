/**
Author: Laura Thornburg
CIS 175 - Spring Semester
Date: 02/07/2023
*/

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DollarConverter;

/**
 * Servlet implementation class getConversionServlet
 */
@WebServlet("/getConversionServlet")
public class getConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String inputDollars = request.getParameter("inputDollars");
		
		DollarConverter setConversion = new DollarConverter(Integer.parseInt(inputDollars));
		
		//PrintWriter writer = response.getWriter();
		//writer.println("The conversion amount of Euros is: " + setConversion.toString());
		//writer.close();
		
		request.setAttribute("userAmount", inputDollars);
		
		getServletContext().getRequestDispatcher("/convertedValue.jsp").forward(request, response);
	}

}
