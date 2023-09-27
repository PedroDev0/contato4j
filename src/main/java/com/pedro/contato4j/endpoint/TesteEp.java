package com.pedro.contato4j.endpoint;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/teste")
public class TesteEp {

	@GET
	public List<Map<String, String>> getTeste() {

		List<Map<String, String>> seiLa = new ArrayList<Map<String, String>>();

		Map<String, String> mp = new LinkedHashMap<String, String>();
		mp.put("1", "baitola");
		seiLa.add(mp);
		seiLa.add(mp);
		seiLa.add(mp);
		
		return seiLa;
	}
	
	
}
