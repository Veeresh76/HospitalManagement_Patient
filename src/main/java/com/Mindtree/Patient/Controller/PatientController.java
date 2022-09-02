package com.Mindtree.Patient.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mindtree.Patient.Entity.Patient;
import com.Mindtree.Patient.Services.PatientServices;

@RestController
@CrossOrigin
public class PatientController {

	@Autowired
	PatientServices  patientServices;

	@GetMapping("/allPatients")
	public ResponseEntity<List<Patient>> allPatients(){
		return new ResponseEntity<List<Patient>>( patientServices.getAllPatients(),HttpStatus.OK);
	}


	@GetMapping("/Patient/{id}")
	public ResponseEntity<Patient> allPatients(@PathVariable ("id") int id){
		return new ResponseEntity<Patient>( patientServices.getPatient(id),HttpStatus.OK);
	}


	//@CrossOrigin
	@PostMapping("/addPatient")
	public ResponseEntity< Patient> addPatient(@RequestBody Patient p) {
		return new ResponseEntity<Patient>( patientServices.addPatients(p),HttpStatus.OK);
	}



}
