package com.example.EmpService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmpServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceApplication.class, args);
	}
	
	@GetMapping("getEmpList")
	public List<String> empList(){
		List<String> list = new ArrayList<>();
		list.add("madhu");
		list.add("praneeth");
		list.add("srinivas");
		return list;
	}

}
