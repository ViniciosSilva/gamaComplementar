package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {

	List<Conta> contas = new ArrayList<>();

    public void adicionar(Conta c) {
        contas.add(c);
    }

    public String exibir(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return contas.get(i).toString();
            }
        }
        return "Não encontrado";
    }

        private int posicao(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumero() == numero) {
                return i;
            }
        }
        return -1; 
    }

    public boolean remover(int numero) {
        int posicao = posicao(numero);
        if (posicao >= 0) { 
            if (contas.remove(posicao) != null) {
                return true;
            }
        }
        return false;
    }
    
    public void depositar(int numero, double valor) {
    	int posicao = posicao(numero);
    	if(posicao!=- 1) {
    		contas.get(posicao).depositar(valor);
    		return;
    	}else {
    		System.out.println("Conta não encontrada"); 
    	}
    }
    
    public void sacar(int numero, double valor) {
    	int posicao = posicao(numero);
    	if(posicao!=- 1) {
    		contas.get(posicao).sacar(valor);
    		return;
    	}else {
    		System.out.println("Conta não encontrada"); 
    	}
    }

    
}
