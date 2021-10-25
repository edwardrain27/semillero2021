package com.hbt.semillero.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate; //hora actual

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table; //librería persistence para el mapeo de clases en tablas de BD

import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

@Entity
@Table(name = "Comic") //recibe el nombre de la tabla

public class Comic implements Serializable {
	
	
	/**
	 * Atributo que determina  
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id	
	@SequenceGenerator(allocationSize= 1, name = "COMIC_SCID_GENERATOR",sequenceName = "SEQ_COMIC" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COMIC_SCID_GENERATOR")
	@Column(name = "SCID")
	private Long id;
	
	@Column(name = "SCNOMBRE")
	private String nombre;
	
	@Column(name = "SCEDITORIAL")
	private String editorial;
	
	@Column(name = "SCTEMATICA")
	@Enumerated(value = EnumType.STRING)
	private TematicaEnum tematicaeEnum;
	
	@Column(name = "SCESTADO")
	private String coleccion;
	
	@Column(name = "SCNUMEROPAGINAS")
	private Integer numeroPaginas;
	
	@Column(name = "SCPRECIO")
	private BigDecimal precio;
	
	@Column(name = "SCAUTORES")
	private String autores;
	
	@Column(name = "SCCOLOR")
	private boolean color;
	
	@Column(name = "SCFECHA_VENTA")
	private LocalDate fechaVenta;
	
	@Column(name = "SCESTADO")
	private EstadoEnum estadoEnum;
	
	@Column(name = "SCCANTIDAD")
	private Integer cantidad;

		
	
	
	

	
	
	
	
	
	

	
	
	
}


