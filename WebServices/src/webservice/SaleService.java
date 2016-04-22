package webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Customer;
import model.Employee;
import model.SalesOrderFact;
import controller.ActionModelDatabase;

@WebService
public class SaleService {
	
	@WebMethod
	public boolean id_validiation(int id){
		ActionModelDatabase action=new ActionModelDatabase();
		action.init();
	    Customer customerCheck= action.getCustomer(id);
	    Employee employeeCheck=action.getEmployee(id);
	    action.close();
	    
	    if(customerCheck==null && employeeCheck==null){
	    	return false;
	    }
	    	
	    return true;
	}
	
	@WebMethod ///Main method
	public SalesOrderFact getSalesFact(int id){
		SalesOrderFact object=new SalesOrderFact(id);
	    return object;
	}

	
	
	@WebMethod
 	public void createProduct(int V_id, String V_cat, String V_name){
 		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertProduct(V_id,V_cat,V_name);
 		action.close();
 	}
	
	@WebMethod
	public void createCustomer(int v_customerid,String v_city, String v_companyname, String v_country){
		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertCustomer( v_customerid, v_city, v_companyname, v_country);
 		action.close();
	}
	
	
	@WebMethod
	public void createOrderFact(int v_sales_id,int v_customer_id,int v_employee_id,
	         int v_productid,int v_supplierid,int v_timeid ,double v_price, int v_quanity ){
		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertOrderFact( v_sales_id, v_customer_id, v_employee_id, v_productid, v_supplierid, v_timeid , v_price,  v_quanity);
 		action.close();
	}
	
	@WebMethod
	public void createTime(int v_timeid,int v_date,int v_day,int v_month,String v_quater, int v_year){
		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertTime(v_timeid, v_date, v_day, v_month,v_quater,  v_year);
 		action.close();
	}
	
	@WebMethod
	public void createEmployee(int v_employeeId,String v_empLastName, String v_mgrLastname){
		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertEmployee( v_employeeId, v_empLastName, v_mgrLastname);
 		action.close();
	}
	
	@WebMethod
	public void createSupplier( int v_supplierid, String v_companyname, String v_country){
		ActionModelDatabase action =new ActionModelDatabase();
 		action.init();
 		action.InsertSupplier( v_supplierid,  v_companyname, v_country);
		action.close();
	}
	
	
	
	
	
	
}
