package org.abhishek.SampleApplication.Service;

import java.util.Map;

import org.abhishek.SampleApplication.model.CustomerInfoDTO;
import org.abhishek.SampleApplication.model.InstructionDTO;
import org.abhishek.SampleApplication.model.SuccessMessages;

public interface ServiceInterface {
	public SuccessMessages instructiontype(InstructionDTO i);
}
