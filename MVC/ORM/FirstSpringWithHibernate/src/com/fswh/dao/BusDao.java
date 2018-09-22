package com.fswh.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.fswh.entities.Bus;

public class BusDao {
	private HibernateTemplate hibernateTemplate;

	public BusDao(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public int saveBus(Bus bus){
		return (Integer)hibernateTemplate.save(bus);
	}
	

}
