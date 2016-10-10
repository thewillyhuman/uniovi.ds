package io.guill.uniovi.ds.practica_4.validators;

public class DigitValidator implements Validator {

	/**
	 * Checks if a given input is a digit.
	 * 
	 * @return true if the input is a digit. False otherwise.
	 */
	@Override
	public boolean validate(String input) {
		for (char ch : input.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
