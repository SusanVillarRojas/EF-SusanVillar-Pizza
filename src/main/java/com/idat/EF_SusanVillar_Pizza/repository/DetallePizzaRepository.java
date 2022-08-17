package com.idat.EF_SusanVillar_Pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EF_SusanVillar_Pizza.entity.PizzaDetalle;

@Repository
public interface DetallePizzaRepository extends JpaRepository<PizzaDetalle, Integer> {

}
