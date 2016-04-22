package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the time database table.
 * 
 */
@Entity
@NamedQuery(name="Time.findAll", query="SELECT t FROM Time t")

@XmlRootElement(name="Time")
public class Time implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int timeid;

	private int date;

	private int day;

	private int month;

	private String quater;

	private int year;

	public Time() {
	}
	
	public Time(int v_timeid,int v_date,int v_day,int v_month,String v_quater, int v_year){
		timeid   =v_timeid;
		date     =v_date;
		day      =v_day;
		month    =v_month;
		quater   =v_quater;
		year     =v_year;
	}

	@XmlElement(name="timeID")
	public int getTimeid() {
		return this.timeid;
	}

		public void setTimeid(int timeid) {
			this.timeid = timeid;
		}

	@XmlElement(name="Date")	
	public int getDate() {
		return this.date;
	}

		public void setDate(int date) {
			this.date = date;
		}

	@XmlElement(name="Day")	
	public int getDay() {
		return this.day;
	}

		public void setDay(int day) {
			this.day = day;
		}

	@XmlElement(name="Month")	
	public int getMonth() {
		return this.month;
	}

		public void setMonth(int month) {
			this.month = month;
		}

	@XmlElement(name="Quater")	
	public String getQuater() {
		return this.quater;
	}

		public void setQuater(String quater) {
			this.quater = quater;
		}

	@XmlElement(name="Year")	
	public int getYear() {
		return this.year;
	}

		public void setYear(int year) {
			this.year = year;
		}

}