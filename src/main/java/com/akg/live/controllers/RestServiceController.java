package com.akg.live.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.akg.live.service.ServicePincode;

@RestController
public class RestServiceController {
	
	@Autowired
	private ServicePincode servicePincode;
	
	@RequestMapping(value = "/pincode", method = RequestMethod.GET)
	public String getPincodeDetais(@RequestParam("pincode") String pincode) {
		return servicePincode.getPincodeDetails(pincode);
	}
	
	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public String getData() {
		return "DATA";
	}
	
}
