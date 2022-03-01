package com.ecommerce.nutrizenbackend.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.ecommerce.nutrizenbackend.model.categorias;

@Service
public class categoriasService {
	public final ArrayList<categorias> lista = new ArrayList<categorias>();
    
	 public categoriasService() {
		
		 lista.add(new categorias("Suplementos"
					));
			
		 lista.add(new categorias("Servicios"
					));
			
		 lista.add(new categorias("Accesorios"
					));
			
	     }//constructor
	 
	 public ArrayList<categorias> getCategoria(){
		 return lista;
	 }//getProductos

	public categorias getCategoria(Long prodId) {
		categorias tmpProd = null;

		for(categorias prod: lista) {
		  if(prod.getId_categoria() == prodId) {
			  tmpProd = prod;
		  }//if
		}//foreach
		return tmpProd;
	  }//getProducto

	public void deleteCategoria(Long prodId) {
		for(categorias prod: lista) {
			  if(prod.getId_categoria() == prodId) {
				  lista.remove(prod);
				  break;
			  }//if
			}//foreach
		
	 }//deleteProducto
	
}
