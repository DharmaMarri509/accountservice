package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Account;
import com.example.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accService;

	@GetMapping("/getAccounts")
	public List<Account> getAccount() {
		return accService.getAccounts();
		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Account> saveAccount(@RequestBody Account a) {
		accService.saveAccount(a);
		return new ResponseEntity<>(a,HttpStatus.CREATED);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Account> updateAcc(@PathVariable("id") Integer id,  @RequestBody Account a) {
		accService.updateAccount(id,a);
		return new ResponseEntity<>(a, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteAcc(@PathVariable("id") int id) {
		accService.deleteAccoount(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	
//	@GetMapping("/wipro")
//	public String invokeRest() {
//		return accService.implementRestTemp();
//	}
	
	@GetMapping("/wish")
	public String wish() {
		return "Good Morning from wipro";
	}
	
	@GetMapping("/greet")
	public String greet() {
		return accService.print();
	}
	
}
