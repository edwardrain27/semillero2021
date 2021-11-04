package com.hbt.semillero.ejb;

import javax.ejb.*;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.ConsultaNombrePrecioComicDTO;
import com.hbt.semillero.dto.ConsultarComicTamanioNombreDTO;
import com.hbt.semillero.dto.ResultadoDTO;

import java.math.BigDecimal;
import java.util.List;

//se crea una interfaz que contiene la abstracción de lo que compete
//un comic. Se declara local porque estamos apuntando a una base de datos local
//remota sería conectarnos a otro datasource para hacer uso de los servicios que se van a invocar allá

/**
 * 
 * <b>Descripción:<b> Clase que funciona como interfaz local que proporciona los métodos(CRUD) para el negocio de la app
 * <b>Caso de Uso:<b> 
 * @author Pablo
 * @version
 */
@Local
public interface IGestionarComicLocal {

	//acá vamos a gestionar las acciones del negocio
	//muy probablemente lanzará una Excepción
	public ComicDTO crearComic(ComicDTO comic) throws Exception;
	
	public ResultadoDTO actualizarComic(Long idComic);
	
	public ResultadoDTO eliminarComic(Long idComic);
	
	public List<ComicDTO> consultarComics();
	
	public ConsultaNombrePrecioComicDTO  consultarNombrePrecioComic(Long idComic);
	
	public ConsultarComicTamanioNombreDTO consultarComicTamanioNombre(Short lengthComic) throws Exception;
}
