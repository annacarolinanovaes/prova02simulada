package aplicacao;

import java.util.Scanner;

public class Tela {

	public static int menu(Scanner sc) {
		System.out.println("1 - Cadastrar um novo espet�culo e as participa��es dele");
		System.out.println("2 - Mostrar  os dados de um espet�culo (nome, pre�o total e participa��es");
		System.out.println("3 - Sair");
		return Integer.parseInt(sc.nextLine());
	}
}
