package io.guill.uniovi.ds.practica4.validators;

@FunctionalInterface
public interface IValidator {
	
	/**
	 * Validates a given input.
	 * @param input to validate.
	 * @return true if the input is valid. False otherwise.
	 */
	boolean validate(String input);

}
