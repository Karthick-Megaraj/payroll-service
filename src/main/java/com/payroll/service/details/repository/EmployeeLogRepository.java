package com.payroll.service.details.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payroll.service.details.entity.EmployeeLogEntity;
import com.payroll.service.details.entity.EmployeeLogKeys;

public interface EmployeeLogRepository extends JpaRepository<EmployeeLogEntity, EmployeeLogKeys> {

	List<EmployeeLogEntity> findByEmployeeId(int empId);

}
