package io.guill.uniovi.ds.practica4.validators;

public class LenghtValidator implements IValidator {

	private int lenght;

	public LenghtValidator(int length) {
		this.lenght = length;
	}

	@Override
	public boolean validate(String input) {
		if (input.length() == lenght)
			return true;
		return false;
	}

}
