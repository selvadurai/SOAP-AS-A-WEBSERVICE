/**
 * 
 */
package model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import controller.ActionModelDatabase;

/**
 * @author kevin
 *
 */
@XmlRootElement(name="SalesOrderFact")
public class SalesOrderFact {

    private Customer  customer;
    private Employee  employee;
    private OrderFact orderfact;
    private Supplier  supplier;
    private Time      time;
    private Product   product; 
	
	
	public SalesOrderFact(){
	
    }
    

   public  SalesOrderFact(int id){
    	ActionModelDatabase action=new ActionModelDatabase();
    	action.init();
    	product     = action.getProduct(id);
    	customer    = action.getCustomer(id);
    	time        = action.getTime(id);
    	supplier    = action.getSupplier(id);
    	employee    = action.getEmployee(id);
    	orderfact   = action.getOrderFact(id);
        action.close();
    }
    
	@XmlElement(name="Product")
    public Product getProduct(){
    	return product;
    }
    
	@XmlElement(name="Customer")
    public Customer getCustomer(){
    	return customer;
    }
    
	@XmlElement(name="Time")
    public Time getTime(){
    	return time;
    } 
	
	@XmlElement(name="Employee")
    public Employee getEmployee(){
    	return employee;
    }
    
	@XmlElement(name="OrderFact")
    public OrderFact getOrderFact(){
    	return orderfact;
    }
    
	@XmlElement(name="Supplier")
   public Supplier getSupplier(){
	   return supplier;
   } 

   

}
