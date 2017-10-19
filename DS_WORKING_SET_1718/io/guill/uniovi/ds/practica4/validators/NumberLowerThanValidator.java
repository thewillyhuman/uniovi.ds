package io.guill.uniovi.ds.practica4.validators;

public class NumberLowerThanValidator implements IValidator {

private int numberToCompare;
	
	public NumberLowerThanValidator(int numberToCompare) {
		this.numberToCompare = numberToCompare;
	}

	@Override
	public boolean validate(String content) {
		return (Integer.parseInt(content) < this.numberToCompare);
	}

}
