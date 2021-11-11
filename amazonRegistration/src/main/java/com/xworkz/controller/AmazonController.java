package com.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.AmazonDto;
import com.xworkz.service.AmazonService;

@Controller
public class AmazonController {
	
	
	public AmazonController() {
System.out.println(getClass().getSimpleName()+"object is  created");
	}

	@Autowired
	public AmazonService amazonService;
	
	
	
	@RequestMapping(value="/forget.do")
	public String forgetPassword() {
		return "forgetPassword";
		
	}
	
@RequestMapping(value="/onRegister.do")
public String clickRegister(@ModelAttribute AmazonDto dto, Model model) {
		System.out.println("Amazon register starteed");
		System.out.println(dto);
		boolean result = amazonService.validateAmazonRegister(dto);
		if (result) {

			model.addAttribute("AmazonMessage", "Amazon_Register succesfully done");
return "success";
		}

		else {
			model.addAttribute("AmazonMessageFailed", "your application failed...try again later");
return "fail";
		}

	}

}
