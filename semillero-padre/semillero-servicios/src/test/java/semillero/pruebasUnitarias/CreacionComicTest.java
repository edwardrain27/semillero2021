package semillero.pruebasUnitarias;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.time.LocalDate;


public class CreacionComicTest {

	
	
	private final static Logger log = Logger.getLogger(ComicDTO.class);
	
	//Atributos de la clase CreacionComicTest
	/**
	 * Lista de comics
	 */
	static ArrayList<ComicDTO> comics = new ArrayList<ComicDTO>(); //inicialización de la lista
	
	
	/**
	 * 
	 * Metodo encargado de crear Comics por default. 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	public static void crearComics()
	{
		//Comics que están activos
		comics.add(new ComicDTO(5L,"Dragon Ball GT-Baby Vegeta","Toei",TematicaEnum.FANTASTICO,"Manga",50,new BigDecimal(50000),"Akira toriyama",true,LocalDate.now(),EstadoEnum.ACTIVO,10));
		comics.add(new ComicDTO(6L,"Wolverine","MARVEL",TematicaEnum.CIENCIA_FICCION,"Comic",50,new BigDecimal(50000),"Stan Lee",true,LocalDate.now(),EstadoEnum.ACTIVO,50));
		comics.add(new ComicDTO(7L,"Dragon Ball Z-Saga Freezer","Toei",TematicaEnum.FANTASTICO,"Manga",50,new BigDecimal(50000),"Akira toriyama",true,LocalDate.now(),EstadoEnum.ACTIVO,10));
		comics.add(new ComicDTO(8L,"Alien","Marvel",TematicaEnum.AVENTURAS,"Comic",100,new BigDecimal(75000),"Ridley Scott",true,LocalDate.now(),EstadoEnum.ACTIVO,50));
		comics.add(new ComicDTO(9L,"Weapon X","Marvel",TematicaEnum.FANTASTICO,"Comic",50,new BigDecimal(50000),"Stan lee",true,LocalDate.now(),EstadoEnum.ACTIVO,10));
		
		
		//Comics que estan inactivos
		comics.add(new ComicDTO(10L,"Weapon X","Marvel",TematicaEnum.FANTASTICO,"Comic",60,new BigDecimal(45000),"Stan lee",true,null,EstadoEnum.INACTIVO,0));
		comics.add(new ComicDTO(11L,"Atracciones Fatales X-Men #55","MARVEL",TematicaEnum.FANTASTICO,"Comic",70,new BigDecimal(80000),"Stan Lee",true,null,EstadoEnum.INACTIVO,0));
		comics.add(new ComicDTO(12L,"The Dark Knight","DC",TematicaEnum.HORROR,"DC Comics",85,new BigDecimal(90000),"Bob Kane-Bill Finger",true,null,EstadoEnum.INACTIVO,0));
		comics.add(new ComicDTO(13L,"The Joker","DC",TematicaEnum.HORROR,"DC Comics",40,new BigDecimal(90000),"Bob Kane-Bill Finger",true,null,EstadoEnum.INACTIVO,0));
		comics.add(new ComicDTO(14L,"Batman Vs Superman","DC",TematicaEnum.HORROR,"DC Comics",100,new BigDecimal(90000),"Frank Miller",true,null,EstadoEnum.INACTIVO,0));


	
	}
	
	
	/**
	 * 
	 * Metodo encargado de inicializar prueba unitaria con una configuración básica. 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	@BeforeTest
	public static void inicializar()
	{
		//inicializar el Log con una configuración básica.
		BasicConfigurator.configure();
		log.info("----------inicia la prueba unitaria");
		
	}
	
	
	
	/**
	 * 
	 * Metodo encargado de realizar test para validar comics inactivos 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	public void validarComicsInactivos()
	{
		
		log.debug("Inicia ejecución del método validarComicsInactivos()");
		
		
	}
	
	/**
	 * 
	 * Metodo encargado de realizar test para validar comics activos 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	
	
	@Test
	public void validarComicsActivos()
	{
		log.info("Inicia ejecucion del metodo validarComicsActivos()");

		int longitudActivos = 5;
		
		//creacion de comics
		crearComics();
		//filtrar comics activos
		ArrayList<ComicDTO> activos = getComicsActivos();
		
		try {
			Assert.assertTrue(longitudActivos != activos.size());

			if(longitudActivos!=activos.size())
			{
				log.info("Se ha generado un error funcional probando el test validarComicsActivos()");
				throw new Exception("El numero de comics activos no es el esperado");
			}else
			{
				log.info("Lista de comics activos");
				mostrarLista(activos);	
			}
		}catch(Exception e)
		{
			Assert.assertEquals(e.getMessage(), "El numero de comics activos no es el esperado");

		}	
		log.info("Finaliza la ejecucion del metodo validarComicsActivos()");
	}
	
	/**
	 * 
	 * Metodo encargado de retornar la lista de los comics activos 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 * 
	 * @return
	 */
	private static ArrayList<ComicDTO> getComicsActivos()
	{	//arreglo local
		ArrayList<ComicDTO> activos = new ArrayList<ComicDTO>();
		//foreach para recorrer la lista y devolver
		for(ComicDTO comic:comics) {
			if(comic.getEstadoEnum().equals(EstadoEnum.ACTIVO))
			{
				activos.add(comic);
			}
		}
		
		return activos;
	}
	
	/**
	 * 
	 * Metodo encargado de retornar la lista de comics Inactivos mediante busqueda secuencial
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 * 
	 * @return
	 */
	private static ArrayList<ComicDTO> getComicsInactivos()
	{
		//arreglo local
		ArrayList<ComicDTO> inactivos = new ArrayList<ComicDTO>();
		for(ComicDTO comic:comics)
		{
			if(comic.getEstadoEnum().equals(EstadoEnum.INACTIVO))
			{
				inactivos.add(comic);
			}
				
		}
	
		return inactivos;
	}
	
	/**
	 * 
	 * Metodo encargado de listar los comics especificados por nombre y estado
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 * 
	 * @param lista
	 */
	
	public static void mostrarLista(ArrayList<ComicDTO> lista)
	{
		for(ComicDTO comic:lista) {
			
			System.out.println("Nombre: "+comic.getNombre()+ "\nEstado: "+comic.getEstadoEnum().toString());
		}
	}
	
	
	
	@Test
	public void validarResultadoSumaFallido() {
		log.info("Inicia ejecucion del metodo validarResultadoSumaFallido()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 455;
		
		try {
			//Se espera un resultado true
			Assert.assertTrue(resultado != (numero1 + numero2));
			
			if(resultado != (numero1 + numero2)) {
				log.info("Se ha generado un error funcional probando el test validarResultadoSumaFallido()");
				throw new Exception("La suma ha fallado en el calculo");
			}
		} catch (Exception e) {
			Assert.assertEquals(e.getMessage(), "La suma ha fallado en el calculo");
		}
		
		log.info("Finaliza la ejecucion del metodo validarResultadoSumaFallido()");
	}
	
	
	
	
	/**
	 * 
	 * Metodo encargado de compilar  
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		//crear comics
		
		inicializar();
		//crear configuración básica
		CreacionComicTest test = new CreacionComicTest();
		test.validarComicsActivos();
		
		
		
		
		
	}
	
}
