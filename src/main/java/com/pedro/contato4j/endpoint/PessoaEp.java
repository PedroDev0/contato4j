package com.pedro.contato4j.endpoint;

import java.util.List;

import com.pedro.contato4j.business.PessoaBusiness;
import com.pedro.contato4j.domain.Pessoa;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
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
	@Path("/pessoas")
	public List<Pessoa> getList() {

		List<Pessoa> pessoas = bss.getList();
		return pessoas;
	}

	@GET
	@Path("/{id}")
	public Pessoa getEntity( String pk) {
		return bss.getEntity(pk);
	}

	@POST
	public Pessoa createPessoa(Pessoa entity) {
		return bss.create(entity);
	}

	@PUT
	public Pessoa atualizaPessoa(Pessoa entity) {

		return bss.update(entity);
	}
}
