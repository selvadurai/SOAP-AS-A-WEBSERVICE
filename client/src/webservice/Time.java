
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Quater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time", propOrder = {
    "date",
    "day",
    "month",
    "quater",
    "timeID",
    "year"
})
public class Time {

    @XmlElement(name = "Date")
    protected int date;
    @XmlElement(name = "Day")
    protected int day;
    @XmlElement(name = "Month")
    protected int month;
    @XmlElement(name = "Quater")
    protected String quater;
    protected int timeID;
    @XmlElement(name = "Year")
    protected int year;

    /**
     * Gets the value of the date property.
     * 
     */
    public int getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     */
    public void setDate(int value) {
        this.date = value;
    }

    /**
     * Gets the value of the day property.
     * 
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     */
    public void setDay(int value) {
        this.day = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * Gets the value of the quater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuater() {
        return quater;
    }

    /**
     * Sets the value of the quater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuater(String value) {
        this.quater = value;
    }

    /**
     * Gets the value of the timeID property.
     * 
     */
    public int getTimeID() {
        return timeID;
    }

    /**
     * Sets the value of the timeID property.
     * 
     */
    public void setTimeID(int value) {
        this.timeID = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
