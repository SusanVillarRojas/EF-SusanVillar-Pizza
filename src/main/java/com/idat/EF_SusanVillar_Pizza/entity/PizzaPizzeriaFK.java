package com.idat.EF_SusanVillar_Pizza.entity;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class PizzaPizzeriaFK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4417214286334278899L;

	@Column(name="id_pizza", nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name="id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;
}
