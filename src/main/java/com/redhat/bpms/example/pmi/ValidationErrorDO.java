package com.redhat.bpms.example.pmi;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ValidationErrorDO implements java.io.Serializable {

	private static final long serialVersionUID = -9024323034857317027L;

	@org.kie.api.definition.type.Label(value = "message")
	private java.lang.String msg;

	public ValidationErrorDO() {
	}

	public java.lang.String getMsg() {
		return this.msg;
	}

	public void setMsg(java.lang.String msg) {
		this.msg = msg;
	}

	public ValidationErrorDO(java.lang.String msg) {
		this.msg = msg;
	}

}