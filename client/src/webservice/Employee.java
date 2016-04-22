
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for employee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ManagerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "employeeLastName",
    "employeeID",
    "managerLastName"
})
public class Employee {

    @XmlElement(name = "EmployeeLastName")
    protected String employeeLastName;
    @XmlElement(name = "EmployeeID")
    protected int employeeID;
    @XmlElement(name = "ManagerLastName")
    protected String managerLastName;

    /**
     * Gets the value of the employeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLastName() {
        return employeeLastName;
    }

    /**
     * Sets the value of the employeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLastName(String value) {
        this.employeeLastName = value;
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
     * Gets the value of the managerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagerLastName() {
        return managerLastName;
    }

    /**
     * Sets the value of the managerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagerLastName(String value) {
        this.managerLastName = value;
    }

}
