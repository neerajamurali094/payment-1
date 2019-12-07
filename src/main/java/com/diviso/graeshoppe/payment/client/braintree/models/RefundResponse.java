package com.diviso.graeshoppe.payment.client.braintree.models;

public class RefundResponse {
	
	private String transactionId;

	/**
	 * @return the transactionId
	 */
	public String getTransactionId() {
		return transactionId;
	}

	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
