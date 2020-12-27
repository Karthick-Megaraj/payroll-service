package com.payroll.service.details.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="employee_log_details")
@IdClass(EmployeeLogKeys.class)
public class EmployeeLogEntity {
	
	@Id
	@Column(name = "employee_id")
	private int employeeId; 

	@Id
	@Column(name = "date")
	private LocalDate date;
	
	@Column(name = "log_in")
	private String logIn;
	
	@Column(name = "log_out")
	private String logOut;
	
	@Column(name = "is_Leave")
	private boolean isLeave;

	
}
