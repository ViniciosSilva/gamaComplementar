package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.ContaCorrente;

public class ContaCorrenteTest {

	private ContaCorrente cc;

	@BeforeEach
	public void setup() {
		c = new ContaCorrente(1);
	}

	@Test
	public void deveSubtrairOvalorPassadoDoSaldo() {
		cc.depositar(300);
		cc.sacar(200);

		assertEquals(100, cc.getSaldo());
	}

	@Test
	public void deveSomarOvalorDeDepositoAoSaldoDaConta() {
		
		cc.depositar(300);
		
        assertEquals(300, cc.getSaldo());

	}
}
