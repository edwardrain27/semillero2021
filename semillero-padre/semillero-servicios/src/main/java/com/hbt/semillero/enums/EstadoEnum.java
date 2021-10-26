package com.hbt.semillero.enums;


/**
 * 
 * <b>Descripción:<b> Enumerador que determina el estado de Stock de un Comic
 * <b>Caso de Uso:<b> determinar stock
 * @author Pablo
 * @version
 */
public enum EstadoEnum {
	
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo");
	

	private String estado;
	/**
	 * 
	 * Constructor del enumerador.
	 * @param estado
	 */
	EstadoEnum(String estado)
	{
		this.estado = estado;
	}
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo estado
	 * @return El estado asociado a la clase
	 */
	public String getEstado() {
		return estado;
	}

	
	
}
