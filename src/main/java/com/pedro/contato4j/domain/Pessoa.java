package com.pedro.contato4j.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "PESSOA")
@Table(name = "PESSOA")
public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long codPessoa;
	private String celular;
	private String nome;

	public Pessoa() {
	}

	public Pessoa(Long codPessoa, String celular, String nome) {
		this.codPessoa = codPessoa;
		this.celular = celular;
		this.nome = nome;
	}

	@Id
	@Column(name = "COD_PESSOA")
	public Long getCodPessoa() {
		return codPessoa;
	}

	public void setCodPessoa(Long codPessoa) {
		this.codPessoa = codPessoa;
	}

	@Column(name = "CELULAR")
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Column(name = "NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [codPessoa=" + codPessoa + ", celular=" + celular + ", nome=" + nome + "]";
	}

}
