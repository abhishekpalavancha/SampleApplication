package org.abhishek.SampleApplication.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.abhishek.SampleApplication.exception.DataNotFound;
import org.abhishek.SampleApplication.model.CustomerInfoDTO;
import org.abhishek.SampleApplication.model.SuccessMessages;
import org.abhishek.SampleApplication.repositary.SampleRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
public class AddDAO implements SampleRepositary {

	@PersistenceContext
	private EntityManager em;

	@Override
	public SuccessMessages addCustomer(CustomerInfoDTO customer) {

		this.em.persist(customer);
		int i = customer.getId();
		if (i == 0) {
			throw new DataNotFound("Cannot Be Added", "410", HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);

		}
		SuccessMessages s = new SuccessMessages();
		s.setID(i);
		s.setTimeStamp(new java.util.Date().toString());
		return s;

	}

	@Override
	public SuccessMessages DeleteCustomer(CustomerInfoDTO customer) {
		CustomerInfoDTO cI = this.em.find(CustomerInfoDTO.class, customer.getId());

		if (cI != null) {
			this.em.remove(cI);
		} else {
			throw new DataNotFound("Id Not Found", "404", HttpStatus.NOT_FOUND);
		}
		SuccessMessages s = new SuccessMessages();
		s.setID(customer.getId());
		s.setTimeStamp(new java.util.Date().toString());
		return s;
	}

	@Override
	public SuccessMessages UpdateCustomer(CustomerInfoDTO customer) {
		CustomerInfoDTO cI = this.em.find(CustomerInfoDTO.class, customer.getId());
		if (cI != null) {
			cI.setName(customer.getName());
			cI.setAge(customer.getAge());
			cI.setEmail(customer.getEmail());
			cI.setVehicles(customer.getVehicles());
		} else {
			throw new DataNotFound("Id Not Found", "404", HttpStatus.NOT_FOUND);
		}
		SuccessMessages s = new SuccessMessages();
		s.setID(customer.getId());
		s.setTimeStamp(new java.util.Date().toString());
		return s;
	}

}
