package com.hbt.semillero.enums;


/**
 * 
 * <b>Descripción:<b> Clase que determina la clasificación de las temáticas asignadas a un comic
 * <b>Caso de Uso:<b> 
 * @author Pablo
 * @version
 */
public enum TematicaEnum {
	AVENTURAS("enum.tematica.aventuras"),
	BELICO("enum.tematica.belico"),
	HUMORISTICO("enum.tematica.humoristico"),
	DEPORTIVO("enum.tematica.deportivo"),
	FANTASTICO("enum.tematica.fantastico"),
	CIENCIA_FICCION("enum.tematica.ciencia_ficcion"),
	HISTORICO("enum.tematica.historico"),
	HORROR("enum.tematica.horror");
	
	private String descripcion;
	
	
	TematicaEnum(String descripcion)
	{
		this.descripcion = descripcion;
	}
	
	public String getDescripcion()
	{
		return this.descripcion;
	}
	
}
