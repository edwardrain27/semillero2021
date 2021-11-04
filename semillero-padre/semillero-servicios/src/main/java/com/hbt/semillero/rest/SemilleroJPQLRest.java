package com.hbt.semillero.rest;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;



@Path("/SemilleroJPQLRest")
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class SemilleroJPQLRest {

	
	private final static Logger log = Logger.getLogger(SemilleroJPQLRest.class);
	
	/**
	 * 
	 * Metodo encargado de inicializar el proyecto
	 * <b>Caso de Uso</b> Permitir poder tener la gestión de una conexión para realizar transacciones (CRUD)
	 * 
	 * @author Pablo
	 * 
	 * @param args
	 */
	//inyectar el EM para obtener acceso a la base de datos
	@PersistenceContext //para realizar apertura y clausura de una transacción
	private EntityManager em;
		
	@GET //solo devuelve si se hace un request
	@Path("/test") //nombre del servicio
	@Produces(MediaType.APPLICATION_JSON)
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public String obtenerUnComic()
	{
		Comic comic = null;
		
		try
		{
			
			
			//Obtencion de un registro de la tabla comic haciendo uso del metodo find de la clase entityManager
			//SELECT * FROM COMIC WHERE ID = 24;
			comic = em.find(Comic.class, 24L);
			
			//Consulta en JPQL para obtener un comic con el id 24 pero quemado haciendo uso del método getSingleResult
			String consultaUnComic = "SELECT c From Comic c WHERE c.id = 24";
			Query queryUnComic = em.createQuery(consultaUnComic);
			comic = (Comic) queryUnComic.getSingleResult();
			
			//Consulta en JPQL para obtener un comic con el id 24 haciendo uso del método 
			//getSingleResult y setParameter
			String consultaUnComicConParametro = "SELECT c FROM Comic c WHERE c.id = :idComic "
					+ " AND c.estadoEnum = :estadoComic "
					+ " ORDER BY c.nombre DESC";
			
			//obtengo un objeto de la clase Query para realizar las tareas de ejecución de consultas
			Query queryUnComicConParametro = em.createQuery(consultaUnComicConParametro);
			queryUnComicConParametro.setParameter("idComic", 24L);
			queryUnComicConParametro.setParameter("estadoComic", EstadoEnum.ACTIVO);
			
			comic = (Comic) queryUnComic.getSingleResult(); //ejecuta la transacción y la devuelve como un objeto
			
			//Hacer una consulta de muchos comics
			String finAllComic = "SELECT cm FROM comic cm";
			Query queryFindAllComic = em.createQuery(finAllComic);
			List<Comic> listaComics = queryFindAllComic.getResultList();
			
			
			
			//Creación del comic superman
			Comic comicSuperman = new Comic();
			comicSuperman.setNombre("Superman");
			comicSuperman.setEditorial("DC2");
			comicSuperman.setColeccion("MARVEL");
			comicSuperman.setNumeroPaginas(100);
			comicSuperman.setPrecio(new BigDecimal(100));
			comicSuperman.setCantidad(36);
			
			em.persist(comicSuperman);
			
			comicSuperman = this.consultarComicPorNombre("Superman");
			
			comicSuperman.setPrecio(new BigDecimal(300));
			comicSuperman.setCantidad(9);
			
			em.merge(comicSuperman); //creo que significa actualizar
			
			String actualizarComic = "UPDATE Comic c SET c.estadoEnum = :estado WHERE c.id = :idComic";
			Query queryActualizar = em.createQuery(actualizarComic);
			queryActualizar.setParameter("estado", EstadoEnum.INACTIVO);
			queryActualizar.setParameter("idComic", 32L);
			queryActualizar.executeUpdate();
			
			String eliminarComic = "DELET FROM Comic c where c.id = :idComic";
			Query queryEliminar = em.createQuery(eliminarComic);
			queryEliminar.setParameter("idComic", 32L);
			queryEliminar.executeUpdate();
			
			
			List<Long> idComics = new ArrayList();
			idComics.add(15L);
			idComics.add(16L);
			idComics.add(32L);
			idComics.add(99L);
			
			
			String actualizarComicsVarios = "UPDATE Comic c SET c.EstadoeEnum = :estado WHERE c.id in (:lisIdComics) ";
			Query queryActualizarComics = em.createQuery(actualizarComicsVarios);
			
			
		}catch(Exception e)
		{
			
		}
		
		return comic.toString();
			
		
		
	}
	
	@GET
	
	//método encargado de consultar comics por nombre
	public Comic consultarComicPorNombre(String nombre)
	{
		String consulta = "SELECT c FROM Comic c WHERE c.nombre = :nombre";
		Query queryConNombre = em.createQuery(consulta);
		Comic comic = (Comic) queryConNombre.getSingleResult();
		
		return comic;
	
	}
	
	@GET
	@Path("/comics")
	@Produces(MediaType.APPLICATION_JSON)
	public String obtenerComics() {
		
		String consultaComic = "SELECT * FROM COMIC";
		Query queryUnComic = em.createQuery(consultaComic);
		Comic comic = (Comic) queryUnComic.getSingleResult();
		
		return comic.toString();
	}
	
	public static void main(String[] args)
	{
		
	
	}

	
}
