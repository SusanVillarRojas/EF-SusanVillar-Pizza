package com.idat.EF_SusanVillar_Pizza.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Pizzeria")
public class Pizzeria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer idPizzeria;
	public String direccion;
	public String sede;

}
