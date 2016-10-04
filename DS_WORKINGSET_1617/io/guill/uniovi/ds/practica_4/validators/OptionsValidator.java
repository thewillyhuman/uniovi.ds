package io.guill.uniovi.ds.practica_4.validators;

public class OptionsValidator implements Validator {
	
	String[] valores;
	public OptionsValidator(String... options) {
		this.valores = options;
	}

	/**
	 * Checks if the input matches with a given values.
	 * 
	 * @param valores to check.
	 * @return true if they matches. False otherwise.
	 */
	@Override
	public boolean validate(String input) {
		for (String valor : valores) {
			if (input.toLowerCase().equals(valor.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
