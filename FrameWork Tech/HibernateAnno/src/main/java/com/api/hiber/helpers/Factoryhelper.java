package com.api.hiber.helpers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Factoryhelper {

	public static SessionFactory getConnection(){
		
		Configuration configuration = new Configuration();
		configuration.configure("com/api/hiber/resources/hibernate.cfg.xml");
		
		// Since hibernate 4 version onwards we've started using ServiceRegistry
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
				configuration.getProperties()).build();
		return configuration.buildSessionFactory(serviceRegistry); 
	}
}
