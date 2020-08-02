package com.basic.StudentTable;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {
	
   private final StudentDetailsRepository repository;
   
   StudentDetailsController(StudentDetailsRepository repository){
	     
	   this.repository = repository;
   }
      
    @GetMapping("/getAllStudents")
    List<StudentDetails> all(){
         return repository.findAll();
    }
    
    @PostMapping("/saveStudents")
    StudentDetails newStudentDetails(@RequestBody StudentDetails newStudentDetails) {
    	return repository.save(newStudentDetails);
    }
}
