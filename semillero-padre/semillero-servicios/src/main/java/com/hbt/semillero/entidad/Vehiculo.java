package com.hbt.semillero.entidad;

import java.math.BigDecimal;

import com.hbt.semillero.enums.TipoVehiculo;


/**
 * 
 * <b>Descripción:<b> Clase que determina las características en común de un vehículo
 * <b>Caso de Uso:<b> SEMILLERO 2021 
 * @author Pablo
 * @version 1.0
 */
public abstract class Vehiculo {

	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private int numeroRuedas;
	/**
	 * Atributo que determina el numero de ruedas de un vehiculo
	 */
	private String color;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private String marca;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private String modelo;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private float cilindraje;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private TipoVehiculo tipoVechiculo;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private int numeroAsientos;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private boolean requiereLicencia;
	/**
	 * Atributo que determina el color de un vehiculo
	 */
	private BigDecimal precio;
	
	/**
	 * 
	 * Constructor de la clase Vehiculo.
	 * @param numeroRuedas
	 * @param color
	 * @param marca
	 * @param modelo
	 * @param cilindraje
	 */
	public Vehiculo(int numeroRuedas, String color, String marca, String modelo, float cilindraje)
	{
		this.numeroRuedas = numeroRuedas;
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.cilindraje = cilindraje;
		
		
	}
	
	public Vehiculo()
	{
		
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(float cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getTipoVechiculo() {
		return tipoVechiculo.getTipo();
	}

	public void setTipoVechiculo(TipoVehiculo tipoVechiculo) {
		this.tipoVechiculo = tipoVechiculo;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public boolean isRequiereLicencia() {
		return requiereLicencia;
	}

	public void setRequiereLicencia(boolean requiereLicencia) {
		this.requiereLicencia = requiereLicencia;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo
				+ ", cilindraje=" + cilindraje + ", tipoVechiculo=" + tipoVechiculo + ", numeroAsientos="
				+ numeroAsientos + ", requiereLicencia=" + requiereLicencia + ", precio=" + precio + "]";
	}
	
	
	
	
	

	
	
	
}
