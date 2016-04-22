package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")

@XmlRootElement(name="Customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int customerid;

	private String city;

	private String companyname;

	private String country;

	public Customer() {
	}
	
	public Customer(int v_customerid,String v_city, String v_companyname, String v_country){
		customerid      =v_customerid;
		city            =v_city;
		companyname     =v_companyname;
		country         =v_country;
		
	}

	@XmlElement(name="customerID")
	public int getCustomerid() {
		return this.customerid;
	}

		public void setCustomerid(int customerid) {
			this.customerid = customerid;
		}

    @XmlElement(name="city")
	public String getCity() {
		return this.city;
	}

		public void setCity(String city) {
			this.city = city;
		}

	@XmlElement(name="CompanyName")
	public String getCompanyname() {
		return this.companyname;
	}

		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}

	@XmlElement(name="Country")
	public String getCountry() {
		return this.country;
	}

		public void setCountry(String country) {
			this.country = country;
		}

}