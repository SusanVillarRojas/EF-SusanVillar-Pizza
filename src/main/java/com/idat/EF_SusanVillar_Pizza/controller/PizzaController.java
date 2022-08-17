package com.idat.EF_SusanVillar_Pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EF_SusanVillar_Pizza.entity.Pizza;
import com.idat.EF_SusanVillar_Pizza.service.PizzaService;

@RestController
@RequestMapping("/api/pizza/v1")
public class PizzaController {
	
	@Autowired
	private PizzaService service;

	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzaPizzeria() {
		service.asignarPizzaPizzeria();
	}
	

}
