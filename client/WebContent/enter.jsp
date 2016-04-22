<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="customer.jsp">back</a> 
<table>
<form action="Database" method="POST">
  <tr>
      <td>ID</td> <td><input type="text" name="id"></td>
      <br>
  </tr>
  
  <tr>
     <tr><td>Customer Country</td> <td><input type="text" name="CustomerCountry"></td></tr> 
     <tr><td>Customer CompanyName</td> <td><input type="text" name="CustomerCompany"></td></tr>
     <tr><td>Customer City</td> <td><input type="text" name="CustomerCity"></td></tr>
  </tr>
  
   <br>
  
   <tr>
     <tr><td>Employee Last Name</td> <td><input type="text" name="empLast"></td></tr> 
     <tr><td>Manager Last  Name</td> <td><input type="text" name="empMgr"></td></tr>
   </tr> 
 
  
   <tr>
     <tr><td>Supplier Company</td> <td><input type="text" name="scompany"></td></tr> 
     <tr><td>Supplier Country</td> <td><input type="text" name="scountry"></td></tr>
  </tr> 
  
  <tr>
     <tr><td>Product Name</td> <td><input type="text" name="pname"></td></tr> 
     <tr><td>Product Company</td> <td><input type="text" name="pcompany"></td></tr>
  </tr> 
  
    <tr>
     <tr><td>Price</td> <td><input type="text" name="price"></td></tr> 
     <tr><td>Quantity</td> <td><input type="text" name="quantity"></td></tr>
  </tr> 
  
  <tr>
     <tr><td>Day</td> <td><input type="text" name="day"></td></tr> 
     <tr><td>Year</td> <td><input type="text" name="year"></td></tr>
       <tr><td>Month</td> <td><input type="text" name="month"></td></tr>
  </tr> 
  
  
  
  
  
  
 
  <tr>
  <td>
    <input type="submit" value="Submit" />
  </td>  
  </tr>
</form>
</table>

</body>
</html>