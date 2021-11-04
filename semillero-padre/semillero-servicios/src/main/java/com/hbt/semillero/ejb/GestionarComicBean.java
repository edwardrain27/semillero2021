package com.hbt.semillero.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.*;
import javax.persistence.*;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.dto.ResultadoDTO;
import com.hbt.semillero.entidad.Comic;



//Bean significa que vamos a crear o manipular las transacciones, es decir, el commic o el rollback de manera manual
//Container se encarga de hacerlo de forma automática

@Stateless //está más orientado al manejo de servicios
@TransactionManagement(TransactionManagementType.CONTAINER) //se pone donde se hacen transacciones
public class GestionarComicBean implements IGestionarComicLocal {
	
	/**
	 * El persistence context contiene la configuración del archivo persistence.XML el cual está configurado para acceder a la base de datos semillero
	 */
	@PersistenceContext
	private EntityManager em; //se utiliza para la apertura de las conexiones y las consultas.
	
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public ComicDTO crearComic(ComicDTO comicDTO) throws Exception {
		
		
		if(comicDTO.getNombre() == null) {
			throw new Exception("El campo nombre es requerido");
		}
		
		ComicDTO comicDTOResult = null;
		Comic comic = this.convertirComicDTOToComic(comicDTO);
		em.persist(comic);
		comicDTOResult = this.convertirComicToComicDTO(comic);
		comicDTOResult.setExitoso(true);
		comicDTOResult.setMensajeEjecucion("El comic ha sido creado exitosamente");
		return comicDTOResult;
		
	}

	@Override
	public ResultadoDTO actualizarComic(Long idComic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultadoDTO eliminarComic(Long idComic) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/**
	 * Metodo encargado de retornar la list de comics como una lista de objetos dto de la clase ComicDTO
	 * @return El id asociado a la clase
	 */
	
	@Override
	public List<ComicDTO> consultarComics() {
		// TODO Auto-generated method stub
		List<ComicDTO> comics = new ArrayList<ComicDTO>();
		//Consulta que trae la información de la tabla comics
		String consulta = "SELECT c FROM Comic c";
		Query consultaComics = em.createQuery(consulta);
		
		comics = (List) consultaComics.getResultList();
		
		
		return comics;
	}

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	@Override
	public ConsultaNombrePrecioComicDTO consultarNombrePrecioComic(Long idComic) {
		
		String consulta = "SELECT c.nombre, c.precio FROM Comic c WHERE c.id = :idComic";
		ConsultaNombrePrecioComicDTO consultaNombrePrecioDTO = new ConsultaNombrePrecioComicDTO();
		
		
		try {
		
			Query queryConsulta = em.createQuery(consulta);
			queryConsulta.setParameter("idComic", idComic);
			Comic comic = (Comic) queryConsulta.getSingleResult();
				
			consultaNombrePrecioDTO.setNombre(comic.getNombre());
			consultaNombrePrecioDTO.setPrecio(comic.getPrecio());
			consultaNombrePrecioDTO.setExitoso(true);
			consultaNombrePrecioDTO.setMensajeEjecucion("Se ejecutó exitosamente la consulta");
			
		
		}catch(Exception e)
		{
			consultaNombrePrecioDTO.setExitoso(false);
			consultaNombrePrecioDTO.setMensajeEjecucion("Se ha presentado un error en la ejecución de la consulta");
			
		}
		
		
		
		return consultaNombrePrecioDTO;
	}
	
	
	private Comic convertirComicDTOToComic(ComicDTO comicDTO)
	{
		Comic comic = new Comic();
		comic.setId(comicDTO.getId());
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaeEnum(comicDTO.getTematicaeEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.isColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;
		
	}
		
	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private ComicDTO convertirComicToComicDTO(Comic comic) {
		
		ComicDTO comicDTO = new ComicDTO();
		comicDTO.setId(comic.getId());
		comicDTO.setNombre(comic.getNombre());
		comicDTO.setEditorial(comic.getEditorial());
		comicDTO.setTematicaeEnum(comic.getTematicaeEnum());
		comicDTO.setColeccion(comic.getColeccion());
		comicDTO.setNumeroPaginas(comic.getNumeroPaginas());
		comicDTO.setPrecio(comic.getPrecio());
		comicDTO.setAutores(comic.getAutores());
		comicDTO.setColor(comic.isColor());
		comicDTO.setFechaVenta(comic.getFechaVenta());
		comicDTO.setEstadoEnum(comic.getEstadoEnum());
		comicDTO.setCantidad(comic.getCantidad());
		return comicDTO;
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	@Override
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(Short lengthComic) throws Exception {
		
		ConsultarComicTamanioNombreDTO consultarComicTamanioNombre = new ConsultarComicTamanioNombreDTO();
		
		if(lengthComic == null)
		{
			throw new Exception("Se ha presentado un error técnico");	
		}
		
		String consulta = "SELECT c FROM Comic c WHERE LENGTH(c.nombre) > :lengthComic ";
		
		
		return consultarComicTamanioNombre;
	}


	

	
	
	
	
}
