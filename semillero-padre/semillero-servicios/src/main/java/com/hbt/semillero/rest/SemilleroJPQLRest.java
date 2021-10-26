package com.hbt.semillero.rest;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.hbt.semillero.entidad.Comic;

import javax.persistence.EntityManager;


public class SemilleroJPQLRest {

	
	
	/**
	 * 
	 * Metodo encargado de inicializar el proyecto
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 * 
	 * @param args
	 */
	
		
	@PersistenceContext
	private EntityManager em;
		
	@GET
	@Path("/test")
	@Produces(MediaType.APPLICATION_JSON)
	public String obtenerUnComic()
	{
		//Comic comic = em.find(Comic.class, 24L);
		
		String consultaComic = "SELECT * FROM COMIC WHERE ID = 24";
		Query queryUnComic = em.createQuery(consultaComic); //vamos ver cómo se hace esto
		Comic comic = (Comic) queryUnComic.getSingleResult(); //nos va a retornar un objeto que va a tener las mismas propiedades que un commit		
		return comic.toString();
		
		
		
	}
	

	
}
