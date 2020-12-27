package com.payroll.service.details.service;

import java.util.List;

import com.payroll.service.details.entity.EmployeeLogEntity;

public interface EmployeeLogService {
	
	
	public List<EmployeeLogEntity> getLog(int empId);

	public EmployeeLogEntity createLog(EmployeeLogEntity logEntity);

}
