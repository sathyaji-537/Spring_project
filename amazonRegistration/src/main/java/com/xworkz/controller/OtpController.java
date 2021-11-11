package com.xworkz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.util.OtpGeneration;

@Controller
public class OtpController {

	private static Integer otppNumber;

	public OtpController() {
		System.out.println(getClass().getSimpleName() + "object is  created");
	}

	@RequestMapping(value = "/stotp.do")
	public String startOTP() {
		return "otpPage";

	}

	@RequestMapping(value = "/startotp.do")
	public String getOtp(Model model) {
		System.out.println("invoked getOTP");
		otppNumber = OtpGeneration.randomNumberGenerator(1000, 9999);
		model.addAttribute("OtpSuccessMessage", "Your Otp  generated in eclipse");
		System.out.println("OTP is generated");
		if (otppNumber != null) {
			return "otpPage";
		} else {
			model.addAttribute("Otperror", "OTP error try again later raa");
		}
		return "startotp.do";
	}

	@RequestMapping(value = "/verifyOTP.do")
	public String VerifyOtp(@RequestParam Integer otp, Model model) {
		System.out.println("invoked verify otp");
		System.out.println("number is" + otp);
		if (otp != null && otp.equals(otppNumber)) {
			model.addAttribute("OTPmessageSucess", "OTP is verfied!!!!please register below form");
			return "registerPage";
		} else {
			model.addAttribute("OTPmessageFailed", "invalid-otp,try again later");
			return "otpVerfiy";
		}

	}

}
