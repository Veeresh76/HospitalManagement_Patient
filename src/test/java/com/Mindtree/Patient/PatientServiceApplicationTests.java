package com.Mindtree.Patient;






import static org.junit.Assert.assertNotEquals;

import java.util.List;


import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.Mindtree.Patient.Entity.Patient;
import com.Mindtree.Patient.Repository.PatientRepository;



@SpringBootTest
class PatientServiceApplicationTests {

	@Autowired
	PatientRepository patientRepository;
	

	
	@Test
	void findAllTest() {
	List ll=	 patientRepository.findAll();
   assertNotEquals(ll.size(),0);
		
	}

	@Test
	void findById() {
	Patient p=	 patientRepository.findById(1).get();
   assertNotEquals(p,null);
		
	}
	
	
	
}
