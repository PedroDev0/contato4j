package com.pedro.contato4j.business;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.pedro.contato4j.persistence.Dao;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class Bss<T> implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;

	protected Dao<T> dao;

	@PostConstruct
	public void init() {
		Type superClass = getClass().getGenericSuperclass();
		ParameterizedType parameterizedType = (ParameterizedType) superClass;
		Type[] typeArguments = parameterizedType.getActualTypeArguments();
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) typeArguments[0];
		dao = new Dao<T>(em, clazz);
	}

}
