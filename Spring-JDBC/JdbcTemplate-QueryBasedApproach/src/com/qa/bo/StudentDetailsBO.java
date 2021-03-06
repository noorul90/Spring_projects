package com.qa.bo;

import java.util.ArrayList;
import java.util.List;

//for rollup logic
public class StudentDetailsBO {
	private StudentBO studentBo;
	private List<String> cources;
	
	public void setStudentBo(StudentBO studentBo) {
		this.studentBo = studentBo;
	}

	public StudentBO getStudentBo() {
		return studentBo;
	}
	
	public List<String> getCources(){
		if(cources==null){
			cources = new ArrayList<String>();
		}
		return cources;
	}

	@Override
	public String toString() {
		return "StudentDetailsBO [studentBo=" + studentBo + ", cources="
				+ cources + "]";
	}

}
