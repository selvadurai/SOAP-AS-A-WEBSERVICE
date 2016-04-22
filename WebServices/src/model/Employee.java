package model;

import java.io.Serializable;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")

@XmlRootElement(name="Employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="EMPLOYEE_ID")
	private int employeeId;

	private String emplastname;

	private String mgrlastname;

	public Employee() {
	}
	
	public Employee(int v_employeeId,String v_empLastName, String v_mgrLastname){
		employeeId  = v_employeeId;
		emplastname = v_empLastName;
        mgrlastname = v_mgrLastname;
	}

	@XmlElement(name="EmployeeID") 
	public int getEmployeeId() {
		return this.employeeId;
	}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

	@XmlElement(name="EmployeeLastName")
	public String getEmplastname() {
		return this.emplastname;
	}

		public void setEmplastname(String emplastname) {
			this.emplastname = emplastname;
		}

	@XmlElement(name="ManagerLastName")
	public String getMgrlastname() {
		return this.mgrlastname;
	}

		public void setMgrlastname(String mgrlastname) {
			this.mgrlastname = mgrlastname;
		}

}