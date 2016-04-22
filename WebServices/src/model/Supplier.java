package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the supplier database table.
 * 
 */
@Entity
@NamedQuery(name="Supplier.findAll", query="SELECT s FROM Supplier s")


@XmlRootElement(name="Supplier")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int supplierid;

	private String companyname;

	private String country;

	public Supplier() {
	}
	
	public Supplier(int v_supplierid, String v_companyname, String v_country){
		supplierid  =v_supplierid;
		companyname =v_companyname;
		country     =v_country;
	}

	@XmlElement(name="supplierID")
	public int getSupplierid() {
		return this.supplierid;
	}

		public void setSupplierid(int supplierid) {
			this.supplierid = supplierid;
		}

	@XmlElement(name="companyName")
	public String getCompanyname() {
		return this.companyname;
	}

		public void setCompanyname(String companyname) {
			this.companyname = companyname;
		}

	@XmlElement(name="country")
	public String getCountry() {
		return this.country;
	}

		public void setCountry(String country) {
			this.country = country;
		}

}