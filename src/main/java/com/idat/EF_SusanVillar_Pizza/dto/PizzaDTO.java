package com.idat.EF_SusanVillar_Pizza.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class PizzaDTO {
	
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;

}
