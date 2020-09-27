package com.lti.dao;

public interface GenericDao {

	public <T> T save(Object obj);
	public <T> T fetchById(Class <T> cl, Object id );

}