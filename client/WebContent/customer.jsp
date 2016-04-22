<%@page import="com.sun.faces.facelets.tag.jsf.core.LoadBundleHandler"%>
<%@ page import="webservice.*"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Customer/Employee Information</title>
</head>
<body>

<a href="enter.jsp">enter data</a> 

<h1>Get Customer/Employee Information</h1>

<form action="customer.jsp" method="post">
   Search ID <input type="number" name="id" />
    <input type="submit" name="submit" value="search" />
</form>
 
<br>
<br>

 

<% 

  
if (request.getParameter("submit") != null) {

        int id;
       
        try{
          id=Integer.parseInt(request.getParameter("id"));
    	}
    	catch (NumberFormatException e){
    	  id=0;
    	
    	}
    	
    	
    	SaleServiceService serviceFactory =  new SaleServiceService();
  		SaleService        service        =  serviceFactory.getSaleServicePort();
  		
  		if(service.idValidiation(id)==true){
  			SalesOrderFact     load           =    service.getSalesFact(id);
     		Product     product        =    load.getProduct();
      		OrderFact   order          =    load.getOrderFact();
       		Supplier    supplier       =    load.getSupplier();
       		Customer    customer		 =    load.getCustomer();
      		Employee    employee       =    load.getEmployee();	
       		Time        time          =    load.getTime();       
 		%>
 
		 <table border=1>
 		<th>Customer Information </th>
  		<tr>
     	<th>Customer Company Name</th>
      	<th>Country             </th>
      	<th>City                </th> 
  		</tr>
  
		<tr>
   		<td><%out.print(customer.getCountry());%>    </td>
   		<td><%out.print(customer.getCompanyName());%> </td>
   		<td><%out.print(customer.getCity());%>       </td>
 		</tr>
		</table>


		<br>
 		<table border=1>
 		<th>Employee Information </th>
  		<tr>
     	<th>Employee Last Name</th>
     	<th>Manager  Last Name </th>
  		</tr>
  
 		 <tr>
   		<td><%out.print(employee.getEmployeeLastName());%>    </td>
   		<td><%out.print(employee.getManagerLastName());%>     </td>
 		</tr>
		</table>

		<br>

 		<table border=1>
 		<th>Supplier Information </th>
  		<tr>
     	<th>Company Name</th>
     	<th>Country     </th>
  		</tr>
  
  		<tr>
   		<td><%out.print(supplier.getCompanyName());%>    </td>
  		 <td><%out.print(supplier.getCountry());%>     </td>
 		</tr>
		</table>

		<br>

 		<table border=1>
 		<th>Product Information </th>
  		<tr>
     	<th>Product Name</th>
     	<th>Product Category     </th>
  		</tr>
  
		 <tr>
  		 <td><%out.print(product.getProductName());%>    </td>
  		 <td><%out.print(product.getProductCategory());%>     </td>
 		</tr>
		</table>

		<br>


	 <table border=1>
 	<th>Sales Information </th>
 	 <tr>
     <th>Price</th>
     <th>Units</th>
 	 </tr>
  
  	<tr>
   	<td><%out.print(order.getPrice());%>    </td>
   	<td><%out.print(order.getQuanity());%>     </td>
 	</tr>
	</table>




	<br>

	<table border=1>
 	<th>Time Information</th>
  	<tr>
     <th>Day       </th>
     <th>Month     </th>
     <th>Quater    </th>
  	</tr>
  
	  <tr>
   	<td><%out.print(time.getDay());%>       </td>
   	<td><%out.print(time.getMonth());%>     </td>
   	<td><%out.print(time.getQuater());%>     </td>
 	</tr>
	</table>

  <% } 
  else{
       out.println("<br>");
       out.println("DOESN'T EXIST");
  }%>





 <%} //end of post validation %>
 



</body>
</html>