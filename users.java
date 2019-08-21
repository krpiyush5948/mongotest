package com.freshers.trainingApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document(collection = "tusers")
public class users {
    @Id
    private String id;
    private String name;
    private String department;
    private String repoting_manager;
    private Integer age;
    private Integer salary;
	public users( String name, String department, String repoting_manager, Integer age, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.repoting_manager = repoting_manager;
		this.age = age;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRepoting_manager() {
		return repoting_manager;
	}
	public void setRepoting_manager(String repoting_manager) {
		this.repoting_manager = repoting_manager;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}

   
}

