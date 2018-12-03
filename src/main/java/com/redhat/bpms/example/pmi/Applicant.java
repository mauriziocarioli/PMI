package com.redhat.bpms.example.pmi;

import java.lang.String;
import java.lang.Double;
import java.io.Serializable;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("SSN")
	private String ssn;
	@org.kie.api.definition.type.Label("name")
	private String name;
	@org.kie.api.definition.type.Label("credit score")
	private Double creditScore;

	@org.kie.api.definition.type.Label(value = "age")
	private java.lang.Integer age;

	public Applicant() {
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(Double creditScore) {
		this.creditScore = creditScore;
	}

	public java.lang.Integer getAge() {
		return this.age;
	}

	public void setAge(java.lang.Integer age) {
		this.age = age;
	}

	public Applicant(java.lang.String ssn, java.lang.String name,
			java.lang.Double creditScore, java.lang.Integer age) {
		this.ssn = ssn;
		this.name = name;
		this.creditScore = creditScore;
		this.age = age;
	}

}
