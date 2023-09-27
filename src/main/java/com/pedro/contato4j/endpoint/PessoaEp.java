package com.pedro.contato4j.endpoint;

import java.util.List;

import com.pedro.contato4j.business.PessoaBusiness;
import com.pedro.contato4j.domain.Pessoa;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/pessoa")
public class PessoaEp {

	@EJB
	private PessoaBusiness bss;

	@GET
	public List<Pessoa> getList() {

		List<Pessoa> pessoas = bss.getList();
		return pessoas;
	}

	
	@POST
	public Pessoa inserePessoa(Pessoa entity) {
		return bss.create(entity);
	}
}
