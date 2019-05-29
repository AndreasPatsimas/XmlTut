package org.patsimas.examplexml.model.entity;

import javax.xml.bind.annotation.XmlElement;

public class Payment {


    @XmlElement(name="cash", namespace = "http://www.bharatthippireddy.com/Patient")
	private Integer cash;
    
    private Insurance insurance;

	public Payment() {
		
	}

	public Payment(Integer cash) {
		super();
		this.cash = cash;
	}

	public Payment(Insurance insurance) {
		super();
		this.insurance = insurance;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(Integer cash) {
		this.cash = cash;
	}
	
	@XmlElement(name="insurance", namespace = "http://www.bharatthippireddy.com/Patient")
	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Payment [cash=" + cash + ", insurance=" + insurance + "]";
	}

	
}
