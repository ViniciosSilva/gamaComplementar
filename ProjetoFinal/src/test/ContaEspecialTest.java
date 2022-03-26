package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entities.ContaEspecial;

public class ContaEspecialTest {

	private ContaEspecial cEspecial;
	
    @BeforeEach
    public void setup() {
        cEspecial = new ContaEspecial(2, 300);
    }
    
    @Test
	public void deveSubtrairOvalorPassadoDoSaldoSomenteSeOvalorDoSaldoOuSaldoMaisLimiteForemMaiorDoQueOvalorDoSaque() {
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


}
