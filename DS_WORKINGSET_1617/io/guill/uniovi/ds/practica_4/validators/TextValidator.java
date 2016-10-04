package io.guill.uniovi.ds.practica_4.validators;

public class TextValidator implements Validator {

	/**
	 * Checks if the input is texts.
	 * 
	 * @return true if it's text. False otherwise.
	 */
	@Override
	public boolean validate(String input) {
		for (char ch : input.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return false;
			}
		}
		return true;
	}

}
