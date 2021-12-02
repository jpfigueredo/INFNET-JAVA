package model.testes;

import model.domain.Pedido;
import model.domain.Solicitante;

public class PedidoTeste {
	public static void main(String[] args) {
		
		Solicitante solicitante = new Solicitante("Jao", "jao@jao.jao", "123.123.123-12");
		
		Pedido pedido = new Pedido();
		pedido.setDescricao("Pedido do Jaozin");
		pedido.setSolicitante(solicitante);
		System.out.println(pedido);
	}
}
