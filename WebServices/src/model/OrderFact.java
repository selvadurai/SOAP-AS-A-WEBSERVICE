package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 * The persistent class for the order_fact database table.
 * 
 */
@Entity
@Table(name="order_fact")
@NamedQuery(name="OrderFact.findAll", query="SELECT o FROM OrderFact o")

@XmlRootElement(name="OrderFact") //JAXB Root Element
public class OrderFact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="SALES_ID")
	private int salesId;

	private int customerid;

	private int employeeid;

	private double price;

	private int productid;

	private int quanity;

	private int supplierid;

	private int timeid;

	public OrderFact() {
	}
	
	public OrderFact(int v_sales_id,int v_customer_id,int v_employee_id,
			         int v_productid,int v_supplierid,int v_timeid ,double v_price, int v_quanity ){
		  salesId=v_sales_id;
		  customerid=v_customer_id;
		  employeeid=v_employee_id;
          productid =v_productid; 
          timeid    =v_timeid;
          price     =v_price;
          quanity   =v_quanity;
          supplierid =v_supplierid;
	}
	
	
	
	@XmlElement(name="SalesID")
	public int getSalesId() {
		return this.salesId;
	}

		public void setSalesId(int salesId) {
			this.salesId = salesId;
		}

	@XmlElement(name="CustomerID")
	public int getCustomerid() {
		return this.customerid;
	}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

	@XmlElement(name="EmployeeID")
	public int getEmployeeid() {
		return this.employeeid;
	}

		public void setEmployeeid(int employeeid) {
			this.employeeid = employeeid;
		}

	@XmlElement(name="price")
	public double getPrice() {
		return this.price;
	}

		public void setPrice(double price) {
			this.price = price;
		}

	@XmlElement(name="productID")
	public int getProductid() {
		return this.productid;
	}

		public void setProductid(int productid) {
			this.productid = productid;
		}

	@XmlElement(name="quanity")
	public int getQuanity() {
		return this.quanity;
	}

	
		public void setQuanity(int quanity) {
			this.quanity = quanity;
		}
	
	@XmlElement(name="SupplierId") 
	public int getSupplierid() {
		return this.supplierid;
	}

		public void setSupplierid(int supplierid) {
			this.supplierid = supplierid;
		}

	@XmlElement(name="timeId") 
	public int getTimeid() {
		return this.timeid;
	}

		public void setTimeid(int timeid) {
			this.timeid = timeid;
		}

}