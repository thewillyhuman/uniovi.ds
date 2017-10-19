package io.guill.uniovi.ds.practica4;

import io.guill.uniovi.ds.practica4.fields.Field;
import io.guill.uniovi.ds.practica4.validators.AndValidator;
import io.guill.uniovi.ds.practica4.validators.DigitValidator;
import io.guill.uniovi.ds.practica4.validators.LenghtValidator;
import io.guill.uniovi.ds.practica4.validators.NumberGreaterThanValidator;
import io.guill.uniovi.ds.practica4.validators.NumberLowerThanValidator;
import io.guill.uniovi.ds.practica4.validators.OptionsValidator;
import io.guill.uniovi.ds.practica4.validators.OrValidator;
import io.guill.uniovi.ds.practica4.validators.TextValidator;

/**
 * 
 * Debería de ser una estructura de decorator en el que tendríamos wrapers como
 * validadores.
 * 
 * <p>
 * <code>
 * new Validador1(new Valinador2(new Validador...N(new Campo("nombre_campo"))))
 * </code>
 * <p>
 *
 * Entonces.... Validador y campo deberían de ser del mismo tipo para poder
 * pasarse por constructor y llamar a los métodos sin problemas.
 * 
 *
 * @author willy
 * @version
 * @since 2017"3"422017
 * @formatter Oviedo Computing Community
 */
public class Main {

	public static void main(String[] args) {
		Form form = new Form();

		form.addField(new Field("Nombre", new TextValidator()));
		form.addField(new Field("Apellido", new TextValidator()));
		form.addField(new Field("Número Teléfono", new DigitValidator()));
		form.addField(new Field("Ciudad", new OptionsValidator("Santander", "Oviedo", "Cádiz")));

		form.addField(new Field("Código Producto", new LenghtValidator(4)));
		form.addField(new Field("Código Postal", new AndValidator(new LenghtValidator(4), new DigitValidator())));
		form.addField(new Field("Edad", new AndValidator(new DigitValidator(), new NumberGreaterThanValidator(18))));
		form.addField(new Field("Sueldo", new AndValidator(new DigitValidator(), new NumberGreaterThanValidator(800), new NumberLowerThanValidator(1200))));
		form.addField(new Field("Ubicación", new OrValidator(new OptionsValidator("Oviedo", "Santander", "Cádiz"), new AndValidator(new DigitValidator(),new LenghtValidator(5)))));
		form.addField(new Field("Código Promoción", new OrValidator(new TextValidator(), new AndValidator(new DigitValidator(), new LenghtValidator(3)))));
			
		form.run();
	}

}
