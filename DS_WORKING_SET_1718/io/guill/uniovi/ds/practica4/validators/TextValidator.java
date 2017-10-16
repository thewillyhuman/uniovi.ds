package io.guill.uniovi.ds.practica4.validators;

public class TextValidator implements IValidator {

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
