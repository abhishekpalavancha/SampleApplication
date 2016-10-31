package org.abhishek.SampleApplication.Controller;

import org.abhishek.SampleApplication.Service.ServiceImpl;
import org.abhishek.SampleApplication.Service.ServiceInterface;
import org.abhishek.SampleApplication.exception.DataNotFound;
import org.abhishek.SampleApplication.model.CustomerInfoDTO;
import org.abhishek.SampleApplication.model.InstructionDTO;
import org.abhishek.SampleApplication.model.SuccessMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerClass {
	private ServiceInterface rs;

	@Autowired
	public ControllerClass(ServiceInterface rs) {
		this.rs = rs;
	}

	@RequestMapping(value = "/input", method = RequestMethod.POST, produces = "application/json")

	public SuccessMessages input(@RequestBody InstructionDTO i) {

		return rs.instructiontype(i);

	}
}
