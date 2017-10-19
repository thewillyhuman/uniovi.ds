package io.guill.uniovi.ds.practica4.validators;

public class AndValidator extends MultipleValidator {

	public AndValidator(IValidator... validators) {
		super(validators);
	}

	public void addCondition(IValidator validator) {
		super.addCondition(validator);
	}

	@Override
	public boolean validate(String content) {
		for (IValidator validator : validators) {
			if (!validator.validate(content))
				return false;
		}
		return true;
	}

}
