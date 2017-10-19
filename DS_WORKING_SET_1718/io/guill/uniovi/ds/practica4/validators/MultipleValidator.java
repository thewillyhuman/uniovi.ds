package io.guill.uniovi.ds.practica4.validators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class MultipleValidator implements IValidator {

	protected List<IValidator> validators = new ArrayList<>();

	public MultipleValidator(IValidator... validators) {
		if (validators == null || validators.length == 0)
			throw new IllegalArgumentException(
					"At least one validator it is needed.");
		this.validators = Arrays.asList(validators);
	}

	public void addCondition(IValidator validator) {
		if (validator == null)
			throw new IllegalArgumentException(
					"A null condition cannot be added to the multiple validator");
		validators.add(validator);
	}
}
