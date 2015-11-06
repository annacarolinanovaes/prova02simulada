package aplicacao;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import dominio.Banda;
import dominio.Espetaculo;
import dominio.Participacao;

public class Principal {
	public static void main(String args[]){

		
		/*Banda banda01 = new Banda(null, "Muse",new  BigDecimal("10000.00"));
		Espetaculo esp01 = new Espetaculo(null,"Rock In Rio 2017");
		Participacao part01 = new Participacao(null, 01, esp01, banda01);*/
		
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();
		
		/*em.getTransaction().begin();
		em.persist(banda01);
		em.getTransaction().commit();
		
		//Comando para gravar a categoria no banco
		System.out.println("Feito!");*/
		
		int cod, op;

		do {
			op = Tela.menu(sc);

			switch (op) {
			case 1:
				em = emf.createEntityManager();
			
				
				em.close();
				break;

			case 2:
				em = emf.createEntityManager();
				
				
				em.close();

				break;

			case 3:
				System.out.println("Fim do programa!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (op != 3);
		
	}
	
}
