package com.pedro.contato4j.persistence;

import java.util.List;

import com.pedro.contato4j.domain.Pessoa;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Dao<T> {

	private EntityManager em;
	private Class<T> clazz;

	public Dao(EntityManager em, Class<T> clazz) {
		this.em = em;
		this.clazz = clazz;
	}

	public T persit(T t) {
		em.persist(t);
		return t;
	}

	@SuppressWarnings("unchecked")
	public List<T> getList() {

		Query query = null;
		try {
			Entity annotetiopn = clazz.getAnnotation(Entity.class);
			query = em.createQuery("select o from " + annotetiopn.name() + " o", clazz);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	public void update(Pessoa entity) {

		em.merge(entity);

	}

	public void delete(Pessoa entity) {
		em.remove(entity);
	}

	public T getEntity(Object pk) {
		return em.find(clazz, pk);
	}
}
