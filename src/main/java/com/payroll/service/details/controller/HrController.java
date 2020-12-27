package com.payroll.service.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.payroll.service.details.entity.EmployeeLogEntity;
import com.payroll.service.details.service.EmployeeLogService;

@RestController
@RequestMapping("/hr")
public class HrController {
	
	@Autowired
	private WebClient.Builder webClient;
	
	@Autowired
	private EmployeeLogService logService;
	
	@GetMapping("/project/{projectType}")
	public List<?> getProjectDetails(@PathVariable String projectType){
		List<?> list = webClient.build().get().uri("http://localhost:8081/employee/project/" + projectType).retrieve().bodyToMono(List.class).block();
		return list;
	}
	
	@GetMapping("/emp/{empId}")
	public ResponseEntity<List> getLog(@PathVariable int empId){
		List<EmployeeLogEntity> entity = logService.getLog(empId);
		return ResponseEntity.ok(entity);
	}
	
	@PostMapping("/emp/log")
	public ResponseEntity<EmployeeLogEntity> createLog(@RequestBody EmployeeLogEntity logEntity){
		EmployeeLogEntity entity = logService.createLog(logEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}
	
	
}
