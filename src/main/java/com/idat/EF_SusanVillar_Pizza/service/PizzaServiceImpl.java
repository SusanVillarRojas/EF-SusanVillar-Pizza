package com.idat.EF_SusanVillar_Pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EF_SusanVillar_Pizza.client.OpenFeignClient;
import com.idat.EF_SusanVillar_Pizza.dto.Pizzeria;
import com.idat.EF_SusanVillar_Pizza.entity.Pizza;
import com.idat.EF_SusanVillar_Pizza.entity.PizzaDetalle;
import com.idat.EF_SusanVillar_Pizza.entity.PizzaPizzeriaFK;
import com.idat.EF_SusanVillar_Pizza.repository.DetallePizzaRepository;
import com.idat.EF_SusanVillar_Pizza.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {
	
	@Autowired
	private PizzaRepository repositoryPizza;
	
	@Autowired
	private DetallePizzaRepository repositoryDetallePizza;
	
	@Autowired
	private OpenFeignClient feign ;
	
	@Override
	public void guardarPizza(Pizza pizza) {
		repositoryPizza.save(pizza);
	}
	
	@Override
	public void asignarPizzaPizzeria() {
		
		List<Pizzeria> listado = feign.listarPizzeriasSeleccionadas();
		PizzaPizzeriaFK fk = null;
		PizzaDetalle detalle = null;
		
		for (Pizzeria pizzeria : listado) {
			
			fk = new PizzaPizzeriaFK();
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle = new PizzaDetalle();
			detalle.setFk(fk);	
			
			repositoryDetallePizza.save(detalle);
		}

	}

}
