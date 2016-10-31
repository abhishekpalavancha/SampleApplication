package org.abhishek.SampleApplication.Service;

import java.util.ArrayList;

import org.abhishek.SampleApplication.DAO.AddDAO;
import org.abhishek.SampleApplication.model.CustomerInfoDTO;
import org.abhishek.SampleApplication.model.InstructionDTO;
import org.abhishek.SampleApplication.model.SuccessMessages;
import org.abhishek.SampleApplication.repositary.SampleRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private SampleRepositary sr;

	@Transactional
	@Override
	public SuccessMessages instructiontype(InstructionDTO i) {
		String instruction = i.getInstruction();
		if (instruction.equals("ADD")) {

			return sr.addCustomer(i.getCustomer());

		} else if (instruction.equals("DELETE")) {
			return sr.DeleteCustomer(i.getCustomer());

		} else if (instruction.equals("UPDATE")) {
			return sr.UpdateCustomer(i.getCustomer());

		}
		return null;

	}

}
