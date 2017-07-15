/**
 * Project: ejb_project
 * File: Employee.java
 * Date: Jul 15, 2017
 * Time: 12:32:40 AM
 * Description: This class is a entity class which represent a employee table in database. 
 */

package ejb_project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Yashar Rahvar
 *
 */
@Entity
@Table
public class Employee {

	@Id
	private String id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String dob;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
