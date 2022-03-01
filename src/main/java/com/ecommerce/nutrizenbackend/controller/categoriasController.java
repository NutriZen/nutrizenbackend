package com.ecommerce.nutrizenbackend.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.nutrizenbackend.model.categorias;
import com.ecommerce.nutrizenbackend.service.categoriasService;



@RestController
@RequestMapping(path="/api/categorias")
public class categoriasController {

	private final categoriasService catService;
	@Autowired
	public categoriasController(categoriasService catService) {
		this.catService = catService;
		
	}//constructor
	
	@GetMapping
	public List<categorias> getCategorias(){
	return catService.getCategoria();	
		
	}// getProductos
	@GetMapping(path="{proId}")
	public categorias getCategoria(@PathVariable("proId") Long proId){
	return catService.getCategoria(proId);	
		
	}// getProducto
	@PostMapping
	public void addCategorias() {
		
		
	}//addProducto
	@PutMapping
	public void updateCategorias() {
		
		
	}//updateProducto
	
	@DeleteMapping(path="{proId}")
	public void deleteCategorias(@PathVariable("proId") Long proId) {
		catService.deleteCategoria(proId);
		
	}//deleteProducto
	
	
	
   }
