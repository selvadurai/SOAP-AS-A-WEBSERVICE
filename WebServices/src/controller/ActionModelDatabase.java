package controller;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



















import model.Customer;
import model.Employee;
import model.OrderFact;
import model.Product;
import model.Supplier;
import model.Time;

public class ActionModelDatabase {
	
	private EntityManagerFactory      emfactory;
	private EntityManager             entityManager;
	private ArrayList<Product>        productList;

	public ActionModelDatabase(){
		
	}
 
	public void init(){
		emfactory=Persistence.createEntityManagerFactory("a1");
        entityManager = emfactory.createEntityManager( );
        productList   = new ArrayList<Product>();
    }
	
	public ArrayList<Product> CreateProducts(){
		    for(int i=1;i<100;i++){
		          Product  x =entityManager.find( Product.class, i );
		
		           if(x==null){
		    	       i=100;
		           }
		           else{
		               productList.add(x);
		           }   
		   }
	
	   return productList;
	}

   /***********************INSERT OBJECTS INTO DATABASE****************************************************/
	
    public void InsertProduct(int v_id,String Vcat,String Vname){
    	entityManager.getTransaction().begin(); 
		Product product=new Product(v_id,Vcat,Vname);
		entityManager.persist(product);
    	entityManager.getTransaction( ).commit( );
    }
    
    public void InsertCustomer(int v_customerid,String v_city, String v_companyname, String v_country){
    	entityManager.getTransaction().begin();
    	Customer customer=new Customer( v_customerid, v_city,  v_companyname, v_country);
    	entityManager.persist(customer);
    	entityManager.getTransaction( ).commit( );
    
    }
    
    public void InsertOrderFact(int v_sales_id,int v_customer_id,int v_employee_id,
	         int v_productid,int v_supplierid,int v_timeid ,double v_price, int v_quanity ){
    	
    	entityManager.getTransaction().begin();
    	OrderFact order=new OrderFact( v_sales_id, v_customer_id, v_employee_id, v_productid, v_supplierid, v_timeid ,v_price, v_quanity );
    	entityManager.persist(order);
    	entityManager.getTransaction( ).commit( );
    	
    }
    
    
    public void InsertTime(int v_timeid,int v_date,int v_day,int v_month,String v_quater, int v_year){
    	entityManager.getTransaction().begin();
        Time time = new Time( v_timeid, v_date, v_day, v_month, v_quater, v_year);
        entityManager.persist(time);
    	entityManager.getTransaction( ).commit( );
    }
    
    
    
    public void InsertEmployee(int v_employeeId,String v_empLastName, String v_mgrLastname){
    	entityManager.getTransaction().begin();
        Employee emp = new Employee( v_employeeId, v_empLastName,  v_mgrLastname);
        entityManager.persist(emp);
    	entityManager.getTransaction( ).commit( );
    	
    }
    
    public void InsertSupplier( int v_supplierid, String v_companyname, String v_country){
    	entityManager.getTransaction().begin();
    	Supplier supplier=new Supplier( v_supplierid, v_companyname,  v_country);
        entityManager.persist(supplier);
    	entityManager.getTransaction( ).commit( );
    	
    }
    
    /***********************END INSERT OBJECT INTO DATABASE METHODS*************************************************/
    
    /************************GET DATABASE OBJECTS******************************************************************/
     
    public Product  getProduct(int id){
    	return entityManager.find( Product.class, id );
    }
    
    public OrderFact getOrderFact(int id){
    	return entityManager.find( OrderFact.class, id );
    }
    
    public Supplier getSupplier(int id){
    	return entityManager.find( Supplier.class, id );
    }
    
    public Time  getTime(int id){
    	return entityManager.find( Time.class, id );
    }
    
    public Customer getCustomer(int id){
    	return entityManager.find( Customer.class, id );
    }
    
    public Employee getEmployee(int id){
    	return entityManager.find( Employee.class, id );
    }
    
    /***********************END SEARCH FOR DATABASE OBJECTS***********************************************************************************************/
	
	public void close(){
	   emfactory.close();	
	}

}
