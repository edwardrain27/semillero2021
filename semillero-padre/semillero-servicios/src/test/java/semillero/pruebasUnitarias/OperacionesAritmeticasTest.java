package semillero.pruebasUnitarias;

//librerías
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//PRUEBAS UNITARIAS


//clase para las operaciones aritmeticas de la cual se van a realizar pruebas unitarias
public class OperacionesAritmeticasTest {
	
	private final static Logger log = Logger.getLogger(OperacionesAritmeticasTest.class);
	
	@BeforeTest
	public void inicializar()
	{
		//inicializar el Log con una configuración básica.
		BasicConfigurator.configure();
		log.info("----------inicia la prueba unitaria");
	}
	/**
	 * 
	 * Metodo encargado de probar que la suma de dos enteros sea igual a 450 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	@Test(enabled=false)	
	public void validarResultadoSumaExitosa()
	{
		log.debug("Inicia ejecución del método validarResultadoSumaExitoso()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado= 450;
		
		//esta clase contiene una serie de métodos para hacer comprobaciones
		//Assert.assertFalse(condition);
		//Assert.assertTrue(condition);
		//Assert.assertNotNull(object);
		
		
		Assert.assertEquals(resultado, numero1+numero2);
		
		
		
		log.info("Finaliza la ejecucion del metodo validarResultadoSumaExitoso()");
		
	}
	
	public static void main(String[] args)
	{
		OperacionesAritmeticasTest op = new OperacionesAritmeticasTest();
		op.inicializar();
		op.validarResultadoSumaFallido();
	
	}
	
	/**
	 * 
	 * Metodo encargado de probar que la suma de 2 numeros es fallida 
	 * <b>Caso de Uso</b>
	 * @author Pablo
	 *
	 */
	
	@Test(enabled = false)
	public void validarResultadoSumaFallido()
	{
		log.info("Inicia ejecución del metodo validarResultadoSumaFallido()");
		
		int numero1 = 300;
		int numero2 = 150;
		int resultado = 455;
		
		try {
			if(resultado != (numero1+numero2))
			{
				log.info("Se ha generado un error funcional probando el test");
				throw new Exception("La suma ha fallado en el calculo");
			}
			
		}catch(Exception e) {
			Assert.assertEquals(e.getMessage(),"La suma ha fallado en el calculo" );
		}
		
		
		log.info("Finaliza ejecución del metodo validarResultadoSumaFallido()");

	}
	@AfterTest
	public void finalizarPruebasUnitarias()
	{
		log.info(":::::::Finalizan Pruebas Unitarias:::::::");
	}

}
