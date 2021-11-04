package com.hbt.semillero.dto;

import java.util.List;

public class ConsultarComicTamanioNombreDTO extends ResultadoDTO {

	/**
	 * Atributos de la clase
	 */
	
	private List<ComicDTO> aceptados;
	private List<ComicDTO> noAceptados;
	
	public ConsultarComicTamanioNombreDTO() {
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo aceptados
	 * @return El aceptados asociado a la clase
	 */
	public List<ComicDTO> getAceptados() {
		return aceptados;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo aceptados
	 * @param aceptados El nuevo aceptados a modificar.
	 */
	public void setAceptados(List<ComicDTO> aceptados) {
		this.aceptados = aceptados;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo noAceptados
	 * @return El noAceptados asociado a la clase
	 */
	public List<ComicDTO> getNoAceptados() {
		return noAceptados;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo noAceptados
	 * @param noAceptados El nuevo noAceptados a modificar.
	 */
	public void setNoAceptados(List<ComicDTO> noAceptados) {
		this.noAceptados = noAceptados;
	}
	
	
	
	
}
