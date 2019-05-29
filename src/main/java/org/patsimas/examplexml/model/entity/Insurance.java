package org.patsimas.examplexml.model.entity;

import javax.xml.bind.annotation.XmlElement;

public class Insurance {
	
	private String provider;
		
	private int limit;

	public Insurance() {
		
	}

	public Insurance(String provider, int limit) {
		super();
		this.provider = provider;
		this.limit = limit;
	}

	@XmlElement(name="provider", namespace = "http://www.bharatthippireddy.com/Patient")
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	@XmlElement(name="limit", namespace = "http://www.bharatthippireddy.com/Patient")
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Insurance [provider=" + provider + ", limit=" + limit + "]";
	}
	
}
