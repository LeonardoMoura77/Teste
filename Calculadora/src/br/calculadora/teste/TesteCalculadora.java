package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void test() {
		//cen�rio
		int a = 2;
		int b = 6;
		//a��o
		Calculadora calculadora = new Calculadora();
		int resultadoObtido = calculadora.soma(a, b);
		//verifica��o
		assertEquals(a + b, resultadoObtido);
	}

}
