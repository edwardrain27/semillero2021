package com.hbt.semillero.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;


/**
 * 
 * <b>Descripción:<b> Clase DTO
 * <b>Caso de Uso:<b> 
 * @author Pablo
 * @version
 */
public class ComicDTO implements Serializable {
		
	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Atributo que representa el id del comic
	 */
	private Long id;
	/**
	 * Atributo que representa el nombre de comic
	 */
	private String nombre;
	/**
	 * Atributo que representa el nombre del editorial
	 */
	private String editorial;
	/**
	 * Atributo que categoriza la temática del comic
	 */
	private TematicaEnum tematicaeEnum;
	/**
	 * Atributo que determina el tipo de revista
	 */
	private String coleccion;
	/**
	 * Atributo que representa el número de páginas que contiene el comic
	 */
	private Integer numeroPaginas;
	/**
	 * Atributo que representa el precio del comic
	 */
	private BigDecimal precio;
	/**
	 * Atributo que representa los autores
	 */
	private String autores;
	/**
	 * Atribuyo que determina si el comic tiene color(true) o es a blanco y negro(false)
	 */
	private boolean color;
	/**
	 * Atributo que representa la fecha desde el momento que se actualiza en stock
	 */
	private LocalDate fechaVenta;
	/**
	 * Atributo que representa el estado de stock del comic
	 */
	private EstadoEnum estadoEnum;
	/**
	 * Atributo que muestra la cantidad de articulos de este comic
	 */
	private Integer cantidad;
	/**
	 * Constructor de la clase.
	 * @param id
	 * @param nombre
	 * @param editorial
	 * @param tematicaeEnum
	 * @param coleccion
	 * @param numeroPaginas
	 * @param precio
	 * @param autores
	 * @param color
	 * @param fechaVenta
	 * @param estadoEnum
	 * @param cantidad
	 */
	
	//Constructor de la clase ComicDTO
	
	
	public ComicDTO(Long id, String nombre, String editorial, TematicaEnum tematicaeEnum, String coleccion,
			Integer numeroPaginas, BigDecimal precio, String autores, boolean color, LocalDate fechaVenta,
			EstadoEnum estadoEnum, Integer cantidad) {
		super(); //hereda de object
		this.id = id;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tematicaeEnum = tematicaeEnum;
		this.coleccion = coleccion;
		this.numeroPaginas = numeroPaginas;
		this.precio = this.precio;
		this.autores = autores;
		this.color = color;
		this.fechaVenta = fechaVenta;
		this.estadoEnum = estadoEnum;
		this.cantidad = cantidad;
	}
	
	public ComicDTO()
	{
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo editorial
	 * @return El editorial asociado a la clase
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo editorial
	 * @param editorial El nuevo editorial a modificar.
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo tematicaeEnum
	 * @return El tematicaeEnum asociado a la clase
	 */
	public TematicaEnum getTematicaeEnum() {
		return tematicaeEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo tematicaeEnum
	 * @param tematicaeEnum El nuevo tematicaeEnum a modificar.
	 */
	public void setTematicaeEnum(TematicaEnum tematicaeEnum) {
		this.tematicaeEnum = tematicaeEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo coleccion
	 * @return El coleccion asociado a la clase
	 */
	public String getColeccion() {
		return coleccion;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo coleccion
	 * @param coleccion El nuevo coleccion a modificar.
	 */
	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo numeroPaginas
	 * @return El numeroPaginas asociado a la clase
	 */
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo numeroPaginas
	 * @param numeroPaginas El nuevo numeroPaginas a modificar.
	 */
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo precio
	 * @return El precio asociado a la clase
	 */
	public BigDecimal getPrecio() {
		return precio;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo precio
	 * @param precio El nuevo precio a modificar.
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo autores
	 * @return El autores asociado a la clase
	 */
	public String getAutores() {
		return autores;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo autores
	 * @param autores El nuevo autores a modificar.
	 */
	public void setAutores(String autores) {
		this.autores = autores;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo color
	 * @return El color asociado a la clase
	 */
	public boolean isColor() {
		return color;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo color
	 * @param color El nuevo color a modificar.
	 */
	public void setColor(boolean color) {
		this.color = color;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo fechaVenta
	 * @return El fechaVenta asociado a la clase
	 */
	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo fechaVenta
	 * @param fechaVenta El nuevo fechaVenta a modificar.
	 */
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo estadoEnum
	 * @return El estadoEnum asociado a la clase
	 */
	public EstadoEnum getEstadoEnum() {
		return estadoEnum;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo estadoEnum
	 * @param estadoEnum El nuevo estadoEnum a modificar.
	 */
	public void setEstadoEnum(EstadoEnum estadoEnum) {
		this.estadoEnum = estadoEnum;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo serialVersionUID
	 * @return El serialversionuid asociado a la clase
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ComicDTO [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", tematicaeEnum="
				+ tematicaeEnum + ", coleccion=" + coleccion + ", numeroPaginas=" + numeroPaginas + ", precio=" + precio
				+ ", autores=" + autores + ", color=" + color + ", fechaVenta=" + fechaVenta + ", estadoEnum="
				+ estadoEnum + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	
	

	

}
