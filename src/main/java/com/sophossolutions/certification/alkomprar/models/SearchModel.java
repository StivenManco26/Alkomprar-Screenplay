package com.sophossolutions.certification.alkomprar.models;

/**
 * Clase modelo para el formulario Flight Finder en newtours 
 * @author manco.5@hotmail.com
 */

public class SearchModel {

	private String producto;

	public SearchModel(String producto) {
		this.producto = producto;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
}
