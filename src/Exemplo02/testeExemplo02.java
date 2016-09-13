package Exemplo02;

import org.junit.Assert;
import org.junit.Test;

public class testeExemplo02 {

	static Exemplo02 teste = new Exemplo02();

	@Test
	public void validaNulo(){
		String cnpj = teste.cnpj();

		String[] validaCnpj = new String[cnpj.length()];

		validaCnpj = cnpj.split("");

		for (int i = 0; i < validaCnpj.length; i++) {

			if (validaCnpj[i]==null) {
				Assert.fail();
			}

		}
	}
	
	@Test
	public void validaTamanho() {

		String cnpj = teste.cnpj();

		Assert.assertEquals(14, cnpj.length());

	}

	@Test
	public void validaLetra() {

		String cnpj = teste.cnpj();

		String[] validaCnpj = new String[cnpj.length()];

		validaCnpj = cnpj.split("");

		for (int i = 0; i < validaCnpj.length; i++) {

			if (!Character.isDigit(validaCnpj[i].charAt(0))) {
				Assert.fail();
			}

		}

	}

	@Test
	public void verificaCaracter() {

		String cnpj = teste.cnpj();

		if (cnpj.contains("")) {

		} else {
			Assert.fail();
		}
	}
	

	

}