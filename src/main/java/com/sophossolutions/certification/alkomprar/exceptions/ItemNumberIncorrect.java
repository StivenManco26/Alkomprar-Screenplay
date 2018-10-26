package com.sophossolutions.certification.alkomprar.exceptions;

public class ItemNumberIncorrect extends AssertionError {

	private static final long serialVersionUID = 1L;
	private static final String ERROR_ITEM_NUMBER = "number of items entered greater than the total";

	public static String getErrorItemNumber() {
		return ERROR_ITEM_NUMBER;
	}
	
	//Constructor que llama al constructor de la clase padre AssertionError
	public ItemNumberIncorrect(String message, Throwable cause) {
		super(message, cause);
	}

}
