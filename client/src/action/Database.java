package action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.SaleService;
import webservice.SaleServiceService;

/**
 * Servlet implementation class Database
 */

public class Database extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SaleServiceService serviceFactory =  new SaleServiceService();
  		SaleService        service        =  serviceFactory.getSaleServicePort();
  		
  		int id=Integer.parseInt(request.getParameter("id"));
  		int day=Integer.parseInt(request.getParameter("day"));
  		int year=Integer.parseInt(request.getParameter("year"));
  		int month=Integer.parseInt(request.getParameter("month"));
  		double price=Double.parseDouble(request.getParameter("price"));
  		int quanity=Integer.parseInt(request.getParameter("quantity"));
  		
  		
  		
  		service.createCustomer(id,request.getParameter("CustomerCountry"), request.getParameter("CustomerCompany"),request.getParameter("CustomerCity"));
		service.createEmployee(id,request.getParameter("empLast"), request.getParameter("empMgr"));
		service.createSupplier(id, request.getParameter("scompany"), request.getParameter("scountry"));
		service.createProduct(id,request.getParameter("pcompany") ,request.getParameter("pname"));
		service.createTime(id,id,day,month,"Quater 1",year);
		//This Table Must be Enter Last, since it has forgien Keys//
		service.createOrderFact(id,id,id,id,id,id ,price, quanity); 
		
		String redirectURL = "enter.jsp";
	    response.sendRedirect(redirectURL);
		
	}

}
