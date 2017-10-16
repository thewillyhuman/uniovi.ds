package io.guill.uniovi.ds.practica4;

import java.util.ArrayList;
import java.util.List;

import io.guill.uniovi.ds.practica4.fields.Field;

public class Form {

	private List<Field> field = new ArrayList<Field>();

	public void addField(Field campo) {
		field.add(campo);
	}

	public void run() {
		for (Field field : field) {
			field.input();
			System.out.println(field.content());
		}
	}

}
