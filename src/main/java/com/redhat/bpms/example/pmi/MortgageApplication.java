package com.redhat.bpms.example.pmi;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("mortgage application")
public class MortgageApplication implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("id")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("length of loan (years)")
	private java.lang.Integer lengthOfLoanYears;
	@org.kie.api.definition.type.Label("base loan amount")
	private java.lang.Integer baseLoanAmount;
	@org.kie.api.definition.type.Label("down payment")
	private java.lang.Integer downpayment;
	@org.kie.api.definition.type.Label("annual MIP (bps)")
	private java.lang.Integer annualMIP;
	@org.kie.api.definition.type.Label("program")
	private java.lang.String program;
	@org.kie.api.definition.type.Label("property")
	private com.redhat.bpms.example.pmi.Property property;
	@org.kie.api.definition.type.Label("LTV")
	private java.lang.Float ltv;
	@org.kie.api.definition.type.Label(value = "APR")
	private java.lang.Float apr;

	public MortgageApplication() {
	}

	public java.lang.Integer getBaseLoanAmount() {
		return this.baseLoanAmount;
	}

	public void setBaseLoanAmount(java.lang.Integer baseLoanAmount) {
		this.baseLoanAmount = baseLoanAmount;
	}

	public java.lang.Integer getAnnualMIP() {
		return this.annualMIP;
	}

	public void setAnnualMIP(java.lang.Integer annualMIP) {
		this.annualMIP = annualMIP;
	}

	public java.lang.Integer getLengthOfLoanYears() {
		return this.lengthOfLoanYears;
	}

	public void setLengthOfLoanYears(java.lang.Integer lengthOfLoanYears) {
		this.lengthOfLoanYears = lengthOfLoanYears;
	}

	public java.lang.Integer getDownpayment() {
		return this.downpayment;
	}

	public void setDownpayment(java.lang.Integer downpayment) {
		this.downpayment = downpayment;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public MortgageApplication(
	        java.lang.Integer baseLoanAmount,
			java.lang.Integer annualMIP, 
			java.lang.String program,
			java.lang.Integer lengthOfLoanYears, 
			java.lang.Integer downpayment,
			java.lang.Float apr, 
			java.lang.String id) {
		this.baseLoanAmount = baseLoanAmount;
		this.annualMIP = annualMIP;
		this.program = program;
		this.lengthOfLoanYears = lengthOfLoanYears;
		this.downpayment = downpayment;
		this.apr = apr;
		this.id = id;
	}

	public java.lang.String getProgram() {
		return this.program;
	}

	public void setProgram(java.lang.String program) {
		this.program = program;
	}

	public com.redhat.bpms.example.pmi.Property getProperty() {
		return this.property;
	}

	public void setProperty(com.redhat.bpms.example.pmi.Property property) {
		this.property = property;
	}

	public java.lang.Float getLtv() {
		return this.ltv;
	}

	public void setLtv(java.lang.Float ltv) {
		this.ltv = ltv;
	}

	public java.lang.Float getApr() {
		return this.apr;
	}

	public void setApr(java.lang.Float apr) {
		this.apr = apr;
	}

	public MortgageApplication(java.lang.String id,
			java.lang.Integer lengthOfLoanYears,
			java.lang.Integer baseLoanAmount, java.lang.Integer downpayment,
			java.lang.Integer annualMIP, java.lang.String program,
			com.redhat.bpms.example.pmi.Property property, java.lang.Float ltv,
			java.lang.Float apr) {
		this.id = id;
		this.lengthOfLoanYears = lengthOfLoanYears;
		this.baseLoanAmount = baseLoanAmount;
		this.downpayment = downpayment;
		this.annualMIP = annualMIP;
		this.program = program;
		this.property = property;
		this.ltv = ltv;
		this.apr = apr;
	}

}