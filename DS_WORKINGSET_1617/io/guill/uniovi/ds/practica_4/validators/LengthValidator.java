package io.guill.uniovi.ds.practica_4.validators;

public class LengthValidator implements Validator {
	
	int lenght;
	
	public LengthValidator(int length) {
		this.lenght = length;
	}

	@Override
	public boolean validate(String input) {
		if(input.length() == lenght)
			return true;
		return false;
	}

}
