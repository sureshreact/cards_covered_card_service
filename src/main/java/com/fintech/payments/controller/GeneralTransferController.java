package com.fintech.payments.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.payments.service.GeneralTransferService;

@RestController
public class GeneralTransferController {
	
	@Autowired
	private GeneralTransferService generalTransfer;
	
	
	@GetMapping("/start")
	public String getAmount() {
		return "Hi spring boot project";

	}
	

}
