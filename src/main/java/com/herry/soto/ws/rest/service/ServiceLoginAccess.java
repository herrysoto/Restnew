package com.herry.soto.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.herry.soto.ws.rest.vo.VOUsuario;


@Path("/Serviciologin")
public class ServiceLoginAccess {
	
	@POST
	@Path("/Validation")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario Validacion(VOUsuario vo){
		vo.setValidacion(false);
//		System.out.println(vo.toString());

	if(vo.getNombre().equals("herry") && vo.getContrasena().equals("papi")){
		vo.setValidacion(true);
}

	
		
		return vo;
	}
}
