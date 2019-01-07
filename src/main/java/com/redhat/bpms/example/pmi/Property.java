package com.redhat.bpms.example.pmi;

import java.io.Serializable;
import java.lang.String;
import java.lang.Integer;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("property")
public class Property implements Serializable {

	private static final long serialVersionUID = -6246307840321746704L;

	@org.kie.api.definition.type.Label("price")
	private Integer price;
	@org.kie.api.definition.type.Label("address")
	private String address;
	@org.kie.api.definition.type.Label(value = "id")
	private String id;

	public Property() {
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Property(Integer price, String address,
			String id) {
		this.price = price;
		this.address = address;
		this.id = id;
	}

}