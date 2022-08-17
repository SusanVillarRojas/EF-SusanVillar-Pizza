package com.idat.EF_SusanVillar_Pizza.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EF_SusanVillar_Pizza.dto.Pizzeria;

public interface OpenFeignClient {

	@GetMapping("/api/pizza/v1/listar")
	public List<Pizzeria> listarPizzeriasSeleccionadas();
}
