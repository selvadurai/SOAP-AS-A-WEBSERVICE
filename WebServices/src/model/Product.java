package model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/*************************************************************
 * The persistent class for the product database table.      *
 *                                                           * 
 *************************************************************/
@Entity
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")

@XmlRootElement(name="Product") //JAXB Root Element 
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int productid;

	private String productcategory;

	private String productname;

	//Default constructors
	public Product() {
	}

	public Product(int id,String cat,String name) {
	  productid=id;
	  productcategory=cat;
	  productname=name;
	}
	
	@XmlElement(name="ProductID")
	public int getProductid() {
		return this.productid;
	}

		public void setProductid(int productid) {
			this.productid = productid;
		}

	@XmlElement(name="ProductCategory")
	public String getProductcategory() {
		return this.productcategory;
	}

		public void setProductcategory(String productcategory) {
			this.productcategory = productcategory;
		}

	@XmlElement(name="ProductName")
	public String getProductname() {
		return this.productname;
	}

		public void setProductname(String productname) {
			this.productname = productname;
		}

}