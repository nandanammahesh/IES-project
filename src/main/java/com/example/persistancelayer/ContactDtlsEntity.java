package com.example.persistancelayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contact_dtls")
public class ContactDtlsEntity   {
	@Id
	@Column(name="contact_id")
	@GeneratedValue
	private Integer contactId;
	@Column(name="First_name")
	private String firstName;
	@Column(name="contact_email")
	private String contactMail;
	@Column(name="Last_name")
	private String lastName;
	@Column(name="Pwd")
	private String pwd;
	@Column(name="Gender")
	private String gender;
	@Column(name="Contact_Number")
	private long contactNum;
	@Column(name="DOB")
	private String dob;
	@Column(name="Role")
	private String role;
	@Column(name="SSN_NUM")
	private String ssnNum;
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getContactMail() {
		return contactMail;
	}
	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactNum() {
		return contactNum;
	}
	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsnNum() {
		return ssnNum;
	}
	public void setSsnNum(String ssnNum) {
		this.ssnNum = ssnNum;
	}
	

	

}
