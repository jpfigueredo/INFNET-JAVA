package model.testes;

import model.domain.Solicitante;

public class SolicitanteTeste {
	public static void main(String[] args) {
		
		Solicitante solicitante = new Solicitante("joao", "joao.figueredo@yahool.com", "123.345.456-67");
		System.out.println(solicitante);
		
	}
}
