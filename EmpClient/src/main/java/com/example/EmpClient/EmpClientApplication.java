package com.example.EmpClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class EmpClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpClientApplication.class, args);
	}
	
	@Autowired
	@Lazy
	private RestTemplate restTemplate;
	
	@Value("${emp.service.url}")
	public String url;
	
	@GetMapping("getEmps")
	public ResponseEntity<List> getEmps(){
		System.out.println("url===>"+url);
		ResponseEntity<List> list = restTemplate.getForEntity(url, List.class);
		return list;
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
