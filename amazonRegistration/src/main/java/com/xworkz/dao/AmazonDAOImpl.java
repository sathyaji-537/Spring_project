package com.xworkz.dao;

import java.nio.channels.SeekableByteChannel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.entity.AmazonEntity;

@Component
public class AmazonDAOImpl implements AmazonDAO {

	public AmazonDAOImpl() {
		System.out.println(getClass().getSimpleName() + "object is  created");
	}

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean saveRegisterAmazon(AmazonEntity entity) {
		System.out.println("save method started");
			Session session = null;
			session = sessionfactory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("data is saved in check sql");
			return true;

	}

}
