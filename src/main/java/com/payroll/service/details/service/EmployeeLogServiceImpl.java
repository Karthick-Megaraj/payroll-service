package com.payroll.service.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.service.details.entity.EmployeeLogEntity;
import com.payroll.service.details.repository.EmployeeLogRepository;

@Service
public class EmployeeLogServiceImpl implements EmployeeLogService {

	@Autowired
	private EmployeeLogRepository employeeLogRepository;
	
	@Override
	public List<EmployeeLogEntity> getLog(int empId) {
		return employeeLogRepository.findByEmployeeId(empId);
	}

	@Override
	public EmployeeLogEntity createLog(EmployeeLogEntity logEntity) {
		return employeeLogRepository.save(logEntity);
	}

}
