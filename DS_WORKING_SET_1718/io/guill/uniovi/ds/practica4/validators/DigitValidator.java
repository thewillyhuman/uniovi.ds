package io.guill.uniovi.ds.practica4.validators;

public class DigitValidator implements IValidator {

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
