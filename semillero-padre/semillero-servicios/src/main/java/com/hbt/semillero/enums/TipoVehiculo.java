package com.hbt.semillero.enums;

public enum TipoVehiculo {
	
	TERRESTRE("Terrestre",1),
	ACUATICO("Acuatico",2),
	AEREO("Aereo",3);

	private String tipo;
	private int id;
	
	TipoVehiculo(String tipo, int id)
	{
		this.tipo = tipo;
		this.id = id;
	}
	
	public String getTipo()
	{
		return this.tipo;
	}
	
	public int getId()
	{
		return this.id;
	}
}
