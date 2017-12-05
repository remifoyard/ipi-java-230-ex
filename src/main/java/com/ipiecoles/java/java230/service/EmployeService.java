package com.ipiecoles.java.java230.service;

import com.ipiecoles.java.java230.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;

import com.ipiecoles.java.java230.repository.EmployeRepository;

public class EmployeService {

	@Autowired
	private EmployeRepository employeRepository;
	public Employe findById(Long id){
		return employeRepository.findOne(id);
	}

	public Long countAllEmploye() {
		return employeRepository.count();
	}

	public Employe creerEmploye(Employe e) {
		return employeRepository.save(e);
	}

	public void deleteEmploye(Long id){
		employeRepository.delete(id);
	}
}
