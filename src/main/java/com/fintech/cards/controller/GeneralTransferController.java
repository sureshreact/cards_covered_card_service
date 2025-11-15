package com.fintech.cards.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.cards.service.GeneralTransferService;

@RestController
public class GeneralTransferController {
	
	@Autowired
	private GeneralTransferService generalTransfer;
	
	
	@GetMapping("/start")
	public String getAmount() {
		
		return "Hi spring boot project";

	}
	

}
