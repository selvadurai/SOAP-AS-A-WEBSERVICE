
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salesOrderFact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salesOrderFact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://webservice/}Customer" minOccurs="0"/>
 *         &lt;element ref="{http://webservice/}Employee" minOccurs="0"/>
 *         &lt;element ref="{http://webservice/}OrderFact" minOccurs="0"/>
 *         &lt;element ref="{http://webservice/}Product" minOccurs="0"/>
 *         &lt;element ref="{http://webservice/}Supplier" minOccurs="0"/>
 *         &lt;element ref="{http://webservice/}Time" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salesOrderFact", propOrder = {
    "customer",
    "employee",
    "orderFact",
    "product",
    "supplier",
    "time"
})
public class SalesOrderFact {

    @XmlElement(name = "Customer", namespace = "http://webservice/")
    protected Customer customer;
    @XmlElement(name = "Employee", namespace = "http://webservice/")
    protected Employee employee;
    @XmlElement(name = "OrderFact", namespace = "http://webservice/")
    protected OrderFact orderFact;
    @XmlElement(name = "Product", namespace = "http://webservice/")
    protected Product product;
    @XmlElement(name = "Supplier", namespace = "http://webservice/")
    protected Supplier supplier;
    @XmlElement(name = "Time", namespace = "http://webservice/")
    protected Time time;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the employee property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * Sets the value of the employee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setEmployee(Employee value) {
        this.employee = value;
    }

    /**
     * Gets the value of the orderFact property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFact }
     *     
     */
    public OrderFact getOrderFact() {
        return orderFact;
    }

    /**
     * Sets the value of the orderFact property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFact }
     *     
     */
    public void setOrderFact(OrderFact value) {
        this.orderFact = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link Product }
     *     
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product }
     *     
     */
    public void setProduct(Product value) {
        this.product = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link Supplier }
     *     
     */
    public Supplier getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Supplier }
     *     
     */
    public void setSupplier(Supplier value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTime(Time value) {
        this.time = value;
    }

}
