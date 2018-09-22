package com.cpe.editors;

import java.beans.PropertyEditorSupport;

import com.cpe.beans.ComplexNumber;

public class ComplexNumberPropertyEditor extends PropertyEditorSupport {
	ComplexNumber cn;
	String[] splits;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		splits = text.split(",");
	    cn = new ComplexNumber(Integer.parseInt(splits[0]),Integer.parseInt(splits[1]));
	    setValue(cn);
	}
	

}
