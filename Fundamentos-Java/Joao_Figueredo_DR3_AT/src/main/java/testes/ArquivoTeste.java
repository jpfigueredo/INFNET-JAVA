package testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exception.AtributosExcedidosException;
import exception.NumeroNegativoException;
import exception.NumeroNuloException;
import exception.PersonagensNulosExceptions;
import exception.SkillsInvalidasException;
import model.Arqueiro;
import model.Equipamento;
import model.Ficha;
import model.Guerreiro;
import model.Jogador;
import model.Mago;
import model.Personagem;

public class ArquivoTeste {
	public static void main(String[] args) throws Exception {

		try {

			String arquivo = "Fichas.txt";
			FileReader fileR = new FileReader(arquivo);
			BufferedReader leitura = new BufferedReader(fileR);
			FileWriter fileW = new FileWriter("out_" + arquivo);
			BufferedWriter escrita = new BufferedWriter(fileW);

			String linha = leitura.readLine();

			String[] campos = null;

			List<Personagem> personagens = new ArrayList<Personagem>();

			Ficha ficha = null;
			Jogador player = null;
			Equipamento equipamento = null;

			while (linha != null) {

				campos = linha.split(";");

				String tipo = campos[0];

				switch (tipo.toUpperCase()) {
				case "G":
					try {
						List<String> skills = new ArrayList<String>();
						skills.add("atacar");
						skills.add("defender");
						Guerreiro warrior = new Guerreiro(Integer.valueOf(campos[1]), Integer.valueOf(campos[2]),
								Integer.valueOf(campos[3]), skills);

						personagens.add(warrior);
					} catch (NumeroNegativoException | NumeroNuloException | SkillsInvalidasException
							| AtributosExcedidosException e) {

						System.out.println(e.getMessage());
					}
					break;

				case "A":
					try {
						List<String> habilidades = new ArrayList<String>();
						habilidades.add("atirar");
						habilidades.add("esquivar");

						Arqueiro arch = new Arqueiro(Integer.valueOf(campos[1]), Integer.valueOf(campos[2]),
								Integer.valueOf(campos[3]), habilidades);
						arch.setNome(campos[4]);
						arch.setStamina(Integer.valueOf(campos[5]));
						arch.setLevel(Integer.valueOf(campos[6]));
						arch.setMana(Integer.valueOf(campos[7]));
						arch.setVida(Integer.valueOf(campos[8]));

						personagens.add(arch);
					} catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException
							| AtributosExcedidosException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "M":
					try {
						List<String> magias = new ArrayList<String>();
						magias.add("bola de fogo");
						magias.add("bomba de fumaça");

						Mago mage = new Mago(Integer.valueOf(campos[1]), Integer.valueOf(campos[2]),
								Integer.valueOf(campos[3]), magias);
						mage.setNome(campos[4]);
						mage.setStamina(Integer.valueOf(campos[5]));
						mage.setLevel(Integer.valueOf(campos[6]));
						mage.setMana(Integer.valueOf(campos[7]));
						mage.setVida(Integer.valueOf(campos[8]));

						personagens.add(mage);

					} catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException
							| AtributosExcedidosException e) {
						System.out.println(e.getMessage());
					}
					break;
				case "F":
					Arqueiro arch = null;
					try {
						List<String> habilidades = new ArrayList<String>();
						habilidades.add("atirar");
						habilidades.add("esquivar");

						arch = new Arqueiro(Integer.valueOf(campos[1]), Integer.valueOf(campos[2]),
								Integer.valueOf(campos[3]), habilidades);
						player = new Jogador();
						player.setNome(campos[4]);
						player.setIdade(Integer.valueOf(campos[5]));
						player.setEmail(campos[6]);
						equipamento = new Equipamento(arch, campos[7], campos[8], campos[9]);
					} catch (SkillsInvalidasException | NumeroNegativoException | NumeroNuloException
							| AtributosExcedidosException e) {
						System.out.println(e.getMessage());
					}
					ficha = new Ficha(player);
					ficha.setPersonagem(personagens);
					ficha.setEquipamento(equipamento);
					break;
				default:
					System.out.println("Tipo inválido: " + tipo);
					break;
				}
				linha = leitura.readLine();
			}
			try {
				ficha.impressao();
				escrita.write(ficha.obterLinhaGravacaoArquivo());
			} catch (PersonagensNulosExceptions e) {
				System.out.println(e.getMessage());
			}
			leitura.close();
			escrita.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
