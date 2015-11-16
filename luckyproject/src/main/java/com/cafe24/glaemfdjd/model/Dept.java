package com.cafe24.glaemfdjd.model;

public class Dept {
	String dept_code;
	Company_info company_info;
	String dept_name;
	String dept_location;
	Emp emp;
	int dept_maxmember;
	String dept_phone;
	
	public String getDept_code() {
		return dept_code;
	}
	public void setDept_code(String dept_code) {
		this.dept_code = dept_code;
	}
	public Company_info getCompany_info() {
		return company_info;
	}
	public void setCompany_info(Company_info company_info) {
		this.company_info = company_info;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_location() {
		return dept_location;
	}
	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public int getDept_maxmember() {
		return dept_maxmember;
	}
	public void setDept_maxmember(int dept_maxmember) {
		this.dept_maxmember = dept_maxmember;
	}
	public String getDept_phone() {
		return dept_phone;
	}
	public void setDept_phone(String dept_phone) {
		this.dept_phone = dept_phone;
	}
}
