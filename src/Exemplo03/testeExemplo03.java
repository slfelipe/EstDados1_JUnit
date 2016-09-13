package Exemplo03;

import org.junit.Assert;
import org.junit.Test;

public class testeExemplo03 {
	static Exemplo03 teste = new Exemplo03();

	@Test
	public void validaNulo(){
		String renavam = teste.renavam();

		String[] validaRenavam = new String[renavam.length()];

		validaRenavam = renavam.split("");

		for (int i = 0; i < validaRenavam.length; i++) {

			if (validaRenavam[i]==null) {
				Assert.fail();
			}

		}
	}
	
	@Test
	public void validaTamanho() {

		String renavam = teste.renavam();

		Assert.assertEquals(11, renavam.length());

	}

	@Test
	public void validaLetra() {

		String renavam = teste.renavam();

		String[] validaRenavam = new String[renavam.length()];

		validaRenavam = renavam.split("");

		for (int i = 0; i < validaRenavam.length; i++) {

			if (!Character.isDigit(validaRenavam[i].charAt(0))) {
				Assert.fail();
			}

		}

	}

	@Test
	public void verificaCaracter() {

		String renavam = teste.renavam();

		if (renavam.contains("")) {
		}else{
			Assert.fail();
		}
	}
	

	

}