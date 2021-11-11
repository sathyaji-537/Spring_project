package com.xworkz.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.dao.AmazonDAO;
import com.xworkz.dto.AmazonDto;
import com.xworkz.entity.AmazonEntity;
import com.xworkz.util.OtpGeneration;

@Service
public class AmazonServiceImpl implements AmazonService {

	@Autowired
	private AmazonDAO dao;
	
	//@Autowired
	public OtpGeneration  otpGen;
	
	public AmazonServiceImpl() {
		System.out.println(getClass().getSimpleName()+"object is  created");
	}
	


	public boolean validateAmazonRegister(AmazonDto dto) {
		System.out.println("validateAmazonRegister invoked()");
		AmazonEntity entity = new AmazonEntity();
//		entity.setName(dto.getUserName());
//		entity.setPassword(dto.getPassword());
//		entity.setMailId(dto.getEmail());
//		entity.setPhoneNo(dto.getPhoneNo());
//		entity.setAge(dto.getAge());
//		entity.setAddress(dto.getAddress());
//		entity.setOtp(dto.getOtp());
		BeanUtils.copyProperties(dto, entity);
		
		boolean isValidate = true;

		dao.saveRegisterAmazon(entity);	
		
			isValidate=(dto.getUserName().length()<=20&&dto.getUserName().length()>3
					&&dto.getEmail().endsWith("com")&&dto.getPassword().length()<=10&&dto.getPassword().length()>3);
			System.out.println(" Data_validate successfull");
			
			

		return isValidate;
	}



	

	
}
