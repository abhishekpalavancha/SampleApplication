package org.abhishek.SampleApplication.repositary;

import org.abhishek.SampleApplication.model.CustomerInfoDTO;
import org.abhishek.SampleApplication.model.SuccessMessages;

public interface SampleRepositary {

	public SuccessMessages addCustomer(CustomerInfoDTO c);

	public SuccessMessages DeleteCustomer(CustomerInfoDTO customer);

	public SuccessMessages UpdateCustomer(CustomerInfoDTO customer);
}
