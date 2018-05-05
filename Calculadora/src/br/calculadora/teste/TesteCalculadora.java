package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void test() {
		//cenário
		int a = 2;
		int b = 6;
		//ação
		Calculadora calculadora = new Calculadora();
		int resultadoObtido = calculadora.soma(a, b);
		//verificação
		assertEquals(a + b, resultadoObtido);
	}

}
