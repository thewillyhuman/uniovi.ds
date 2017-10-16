package io.guill.uniovi.ds.practica4.validators;

public class OptionsValidator implements IValidator {

	String[] options;

	public OptionsValidator(String... options) {
		this.options = options;
	}

	@Override
	public boolean validate(String input) {
		for (String option : this.options) {
			if (input.toLowerCase().equals(option.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
