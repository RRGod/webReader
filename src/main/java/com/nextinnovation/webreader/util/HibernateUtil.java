package com.nextinnovation.webreader.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static final Configuration CONFIG;
	static final SessionFactory FACTORY;
	static {
		CONFIG = new Configuration().configure();
		FACTORY = CONFIG.buildSessionFactory();
	}

	public static Session openSession() {
		return FACTORY.openSession();
	}
	
	public static Session getCurrentSession(){
		return FACTORY.getCurrentSession();
	}

	public static void close() {
		FACTORY.close();
	}
}
