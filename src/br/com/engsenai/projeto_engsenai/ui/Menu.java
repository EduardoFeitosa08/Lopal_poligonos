package br.com.engsenai.projeto_engsenai.ui;

import java.util.Scanner;

public class Menu {

	public void criarMenu() {
		System.out.println("---------------------------------");
		System.out.println("CALCULADORA DE POLIGONOS");
		System.out.println("---------------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Triângulo");
		System.out.println("5 - Circuferência");
		System.out.println("6 - SAIR");
		System.out.println("---------------------------------");
		System.out.print("Escolha uma opção (1 - 6):");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		System.out.println("Você pensou na opção " + opcao);
		
	}
	
}
