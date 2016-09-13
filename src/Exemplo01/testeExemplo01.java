package Exemplo01;


import org.junit.Assert;
import org.junit.Test;


public class testeExemplo01 {
	String teste = Exemplo01.triangulo();
	String[] vetor = new String[teste.length()];
	
	

		
	@Test
	public void vericaNulo(){

		for (int i = 0; i < vetor.length; i++) {
			vetor [i] = null;
			vetor = teste.split(";");
			if (vetor[i]==null) {
				Assert.fail();
			}

		}

	}
	
	@Test
	public void validaLetra() {
		vetor = teste.split(";");
		
		for (int i = 0; i < vetor.length; i++) {

			if (!Character.isDigit(vetor[i].charAt(0))) {
				Assert.fail();
			}

		}

	}
	
	@Test
	public void validaMedidaA() {
		vetor = teste.split(";");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
		int c = Integer.parseInt(vetor[2]);
		
		if(a > (b+c)) {
				Assert.fail();
			}
		}

	@Test
	public void validaMedidaB() {
		vetor = teste.split(";");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
		int c = Integer.parseInt(vetor[2]);
		
		if(b > (a+c)) {
				Assert.fail();
			}

		}
	
	@Test
	public void validaMedidaC() {
		vetor = teste.split(";");
		int a = Integer.parseInt(vetor[0]);
		int b = Integer.parseInt(vetor[1]);
<<<<<<< HEAD
	int c = Integer.parseInt(vetor[2]);
=======
		int c = Integer.parseInt(vetor[2]);
>>>>>>> origin/master
		
		if(c > (a+b)) {
				Assert.fail();
			}
		System.out.println(a +" "+ b+" "+ c);
		}
	}
<<<<<<< HEAD
=======

>>>>>>> origin/master
