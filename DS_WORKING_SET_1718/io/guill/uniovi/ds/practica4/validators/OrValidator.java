package io.guill.uniovi.ds.practica4.validators;

public class OrValidator extends MultipleValidator {

	public OrValidator(IValidator... validators) {
		super(validators);
	}

	public void addCondition(IValidator validator) {
		super.addCondition(validator);
	}

	@Override
	public boolean validate(String content) {
		for (IValidator validator : validators) {
			if (validator.validate(content))
				return true;
		}
		return false;
	}

}
