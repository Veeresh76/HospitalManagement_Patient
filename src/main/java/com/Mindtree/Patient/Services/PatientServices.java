package com.Mindtree.Patient.Services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Mindtree.Patient.Entity.Patient;

import com.Mindtree.Patient.Repository.PatientRepository;

@Service
public class PatientServices {



	@Autowired
	PatientRepository patientRepository;

	public String test() {
		Patient p1 = new Patient(1,"abc",23, "01/02/2003","sldf vfgh derr", 101);
		Patient p2 = new Patient(2,"bcde",23, "01/02/2003","abvf vfgh derr", 101);
		Patient p3 = new Patient(3,"asdfe",23, "01/02/2003","zddf vfgh derr", 101);
		Patient p4 = new Patient(4,"wert",24, "01/02/2003","nmjdf vfgh derr", 101);

		patientRepository.save(p1);
		patientRepository.save(p2);
		patientRepository.save(p3);
		patientRepository.save(p4);

		return "done" ;
	}



	public List<Patient> getAllPatients(){
		try {
		return patientRepository.findAll();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		}


	public Patient getPatient(int id) {
		try {
		return patientRepository.findById(id).get();}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	public Patient addPatients(Patient p) {
		try {
		patientRepository.save(p);
		return p;}
		catch(Exception e) {
			e.printStackTrace();
		}
		return p;
	}



}
