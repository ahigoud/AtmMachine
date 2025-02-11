package com.ps.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtmMachineApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmMachineApplication.class, args);
		Account a=new  Account("dtuh", "akhilkumar", "50789", 5.7);
		a.validate();
	}

}
