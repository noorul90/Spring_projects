package com.bm.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bm.form.BusForm;

public class NewBusValidator implements Validator{

	@Override
	public boolean supports(Class<?> classType) {
		return classType.isAssignableFrom(BusForm.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		
		BusForm busForm=null;
		
		busForm=(BusForm)command;
		
		if(busForm.getServiceNo()==null || busForm.getServiceNo().trim().length()==0)
		{
			errors.rejectValue("serviceNo", "serviceno.blank");
		}
		
		if(busForm.getRegdNo()==null || busForm.getRegdNo().trim().length()==0)
		{
			errors.rejectValue("regdNo", "regno.blank");
			
		}
		else if(busForm.getRegdNo().length()<10)
		{
			errors.rejectValue("regdNo", "regno.invalide");
		}
		
		if(busForm.getBusType()==null||busForm.getBusType().trim().length()==0)
		{
			errors.rejectValue("busType", "busType.blank");
		}
		else
		{
			boolean flag=false;
			String []types={"semi sleeper","sleeper"};
			
			String busType=null;
			busType=busForm.getBusType();
			for(String bt:types)
			{
				if(bt.equals(busType))
					flag=true;
			}
			
			if(flag==false)
			{
				errors.rejectValue("busType", "busType.invalide");
			}
		}
		
		if(busForm.getSeatCapacity()<=0)
		{
			errors.rejectValue("seatCapacity", "seatCapacity.invalid");
		}
			
		
	}

	
}
