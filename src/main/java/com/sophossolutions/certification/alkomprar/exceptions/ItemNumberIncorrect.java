package com.sophossolutions.certification.alkomprar.exceptions;

/**
 * Excepción para controlar el numero maximo de items de la lista de productos
 * 
 * @author manco.5@hotmail.com
 */

public class ItemNumberIncorrect extends AssertionError {

	private static final long serialVersionUID = 1L;
	private static final String ERROR_ITEM_NUMBER = "number of items entered greater than the total";
	
	//Retorna el mensaje de error
	public static String getErrorItemNumber() {
		return ERROR_ITEM_NUMBER;
	}

	// Constructor que llama al constructor de la clase padre AssertionError
	public ItemNumberIncorrect(String message, Throwable cause) {
		super(message, cause);
	}

}
