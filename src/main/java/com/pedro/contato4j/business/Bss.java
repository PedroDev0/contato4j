package com.pedro.contato4j.business;

import java.io.Serializable;

import com.pedro.contato4j.persistence.Dao;

import jakarta.inject.Inject;

public class Bss<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	protected Dao<T> dao;

	
}
