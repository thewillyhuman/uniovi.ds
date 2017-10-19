package io.guill.uniovi.ds.practica4.validators;

public class DigitValidator implements IValidator {

	@Override
	public boolean validate(String content) {
		for (char ch : content.toCharArray()) {
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

}
