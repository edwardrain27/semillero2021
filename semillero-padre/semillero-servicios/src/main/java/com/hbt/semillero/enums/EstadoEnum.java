package com.hbt.semillero.enums;

public enum EstadoEnum {
	
	ACTIVO("enum.estado.activo"),
	INACTIVO("enum.estado.inactivo");
	
	private String estado;
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
