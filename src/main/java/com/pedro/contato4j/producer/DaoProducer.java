package com.pedro.contato4j.producer;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.pedro.contato4j.persistence.Dao;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import jakarta.enterprise.inject.spi.InjectionPoint;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Dependent
public class DaoProducer {

	@PersistenceContext
	private EntityManager em;

	@Produces
	public <T> Dao<T> produzDao(InjectionPoint point) {

		ParameterizedType parameterizedType = (ParameterizedType) point.getType();
		Type[] typeArguments = parameterizedType.getActualTypeArguments();
		@SuppressWarnings("unchecked")
		Class<T> clazz = (Class<T>) typeArguments[0];

		return new Dao<T>(em, clazz);
	}
}
