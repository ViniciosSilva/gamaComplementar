package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculadora;

public class CalculadoraTest {

	@Test
	public void deveRetornarASomadosValores() {
		Calculadora c = new Calculadora();

		double resultado = c.somar(10, 20);
		assertEquals(30, resultado, "Soma");

	}
}
