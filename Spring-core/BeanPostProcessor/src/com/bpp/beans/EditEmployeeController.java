package com.bpp.beans;

abstract public class EditEmployeeController {

	private EmployeeDAO empDao;

	public void editEmployee(int employeeId, String firstName, String lastName,
			float salary) {
		EmployeeVO vo = null;
		vo = lookupEmployeeVO();
		vo.setEmployeeId(employeeId);
		vo.setFirstName(firstName);
		vo.setLastName(lastName);
		vo.setSalary(salary);
		empDao.updateEmployee(vo);

	}

	abstract public EmployeeVO lookupEmployeeVO();

	public void setEmpDao(EmployeeDAO empDao) {
		this.empDao = empDao;
	}

}
