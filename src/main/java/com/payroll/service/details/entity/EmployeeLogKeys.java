package com.payroll.service.details.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.EqualsMethod;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
public class EmployeeLogKeys implements Serializable {

	
	private int employeeId; 

	private LocalDate date;
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeLogKeys employeeLogKeys = (EmployeeLogKeys) o;
        return employeeId == employeeLogKeys.employeeId &&
        		date.equals(employeeLogKeys.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, date);
    }
	
	
}
