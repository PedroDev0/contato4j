package com.pedro.contato4j.business;

import java.util.List;

import com.pedro.contato4j.domain.Pessoa;

import jakarta.ejb.Stateless;

@Stateless
public class PessoaBusiness extends Bss<Pessoa> {

	
	private static final long serialVersionUID = 1L;

	public List<Pessoa> getList() {

		return dao.getList();
	}

	public Pessoa create(Pessoa entity) {

		return dao.persit(entity);
	}

	public Pessoa update(Pessoa entity) {
		dao.update(entity);
		return entity;
	}

	public void delete(Pessoa entity) {

		dao.delete(entity);

	}

	public Pessoa getEntity(Object pk) {
	
		return dao.getEntity(pk);

	}
}
