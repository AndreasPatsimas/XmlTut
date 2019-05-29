package org.patsimas.examplexml.model.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="patient", namespace = "http://www.bharatthippireddy.com/Patient")
public class Patient {

	private int id;
	
	private String name;
	
	private int age;
	
	private Date dob;
	
	private String email;
	
	private String gender;
	
	private long phone;
	
	private Payment payment;

	

	public Patient() {
		
	}

	public Patient(int id, String name, int age, Date dob, String email, String gender, long phone, Payment payment) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
		this.payment = payment;
	}

	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name="name", namespace = "http://www.bharatthippireddy.com/Patient")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="age", namespace = "http://www.bharatthippireddy.com/Patient")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@XmlElement(name="dob", namespace = "http://www.bharatthippireddy.com/Patient")
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@XmlElement(name="email", namespace = "http://www.bharatthippireddy.com/Patient")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="gender", namespace = "http://www.bharatthippireddy.com/Patient")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@XmlElement(name="phone", namespace = "http://www.bharatthippireddy.com/Patient")
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@XmlElement(name="payment", namespace = "http://www.bharatthippireddy.com/Patient")
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", email=" + email
				+ ", gender=" + gender + ", phone=" + phone + ", payment=" + payment + "]";
	}

	
	
}
