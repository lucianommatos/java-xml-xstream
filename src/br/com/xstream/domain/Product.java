package br.com.xstream.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("product")
public class Product {
	
	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	
	@XStreamAlias("value")
	@XStreamAsAttribute
	private String value;

	public Product(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
