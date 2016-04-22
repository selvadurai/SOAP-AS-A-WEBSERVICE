
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderFact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderFact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quanity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SalesID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SupplierId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timeId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderFact", propOrder = {
    "customerID",
    "employeeID",
    "price",
    "productID",
    "quanity",
    "salesID",
    "supplierId",
    "timeId"
})
public class OrderFact {

    @XmlElement(name = "CustomerID")
    protected int customerID;
    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    protected double price;
    protected int productID;
    protected int quanity;
    @XmlElement(name = "SalesID")
    protected int salesID;
    @XmlElement(name = "SupplierId")
    protected int supplierId;
    protected int timeId;

    /**
     * Gets the value of the customerID property.
     * 
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     */
    public void setCustomerID(int value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     */
    public void setEmployeeID(int value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the productID property.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Sets the value of the productID property.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Gets the value of the quanity property.
     * 
     */
    public int getQuanity() {
        return quanity;
    }

    /**
     * Sets the value of the quanity property.
     * 
     */
    public void setQuanity(int value) {
        this.quanity = value;
    }

    /**
     * Gets the value of the salesID property.
     * 
     */
    public int getSalesID() {
        return salesID;
    }

    /**
     * Sets the value of the salesID property.
     * 
     */
    public void setSalesID(int value) {
        this.salesID = value;
    }

    /**
     * Gets the value of the supplierId property.
     * 
     */
    public int getSupplierId() {
        return supplierId;
    }

    /**
     * Sets the value of the supplierId property.
     * 
     */
    public void setSupplierId(int value) {
        this.supplierId = value;
    }

    /**
     * Gets the value of the timeId property.
     * 
     */
    public int getTimeId() {
        return timeId;
    }

    /**
     * Sets the value of the timeId property.
     * 
     */
    public void setTimeId(int value) {
        this.timeId = value;
    }

}
