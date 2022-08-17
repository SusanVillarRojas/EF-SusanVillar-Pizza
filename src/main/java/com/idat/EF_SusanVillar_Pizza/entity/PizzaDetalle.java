package com.idat.EF_SusanVillar_Pizza.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="detalle_pizza")
public class PizzaDetalle {
	
	@Id
	private PizzaPizzeriaFK fk =new PizzaPizzeriaFK();

	public PizzaPizzeriaFK getFk() {
		return fk;
	}

	public void setFk(PizzaPizzeriaFK fk) {
		this.fk = fk;
	}
}
