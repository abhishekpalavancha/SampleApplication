package org.abhishek.SampleApplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class InstructionDTO {

	private int id;
	private String instruction;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private CustomerInfoDTO customer;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public CustomerInfoDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfoDTO customer) {
		this.customer = customer;
	}

}
