package com.taw.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.taw.command.NewBusCommand;

public class NewBusValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		if (classType.isAssignableFrom(NewBusCommand.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object command, Errors error) {
		String[] bustype=null;
		bustype=new String[]{"Sleeper","semi sleeper"};
		NewBusCommand nbCommand = null;
		nbCommand = (NewBusCommand)command;
		if(nbCommand.getSrvcno()==null || nbCommand.getSrvcno().trim().length()==0){
			error.rejectValue("srvcno", "srvcno.blank");
		}
		if(nbCommand.getRegno()==null || nbCommand.getRegno().trim().length()==0){
			error.rejectValue("regno", "regno.blank");
			}
		else  if(nbCommand.getRegno().length()<10){
			error.rejectValue("regno", "regno.invalid");
		}
		if(nbCommand.getBustype().equals(null) || nbCommand.getBustype().trim().length()==0){
			error.rejectValue("bustype", "bustype.blank");
		}
		for(String bustypes: bustype){
			if(nbCommand.getBustype().equals("bustype")){
				error.rejectValue("bustype", "bustype.invalid");	
			}
		}
		if(nbCommand.getSeatcap()<=0){
			error.rejectValue("seatcap", "seatcap.invalid");
		}
	}
	
}
