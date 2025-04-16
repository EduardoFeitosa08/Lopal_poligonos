package br.com.engsenai.projeto_engsenai.ui;

import java.util.Scanner;

import br.com.engsenai.projeto_engsenai.model.Circuferencia;
import br.com.engsenai.projeto_engsenai.model.Quadrado;
import br.com.engsenai.projeto_engsenai.model.Retangulo;
import br.com.engsenai.projeto_engsenai.model.Trapezio;
import br.com.engsenai.projeto_engsenai.model.Triangulo;

public class Menu {

	public void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
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
		
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			
			Quadrado q1 = new Quadrado();
			
			System.out.print("Defina o lado: ");
			double lado = leitor.nextDouble();
			q1.setLado(lado);
			q1.mostrarDados();
		}
		
		if (opcao == 2) {
			
			Retangulo r1 = new Retangulo();
			
			System.out.print("Defina a base: ");
			double base = leitor.nextDouble();
			r1.setBase(base);
			System.out.print("Defina a altura: ");
			double altura = leitor.nextDouble();
			r1.setAltura(altura);
			r1.mostrarDados();
		}
		
		if (opcao == 3) {
			
			Trapezio tr1 = new Trapezio();
			
			System.out.print("Defina a base menor: ");
			double baseMenor = leitor.nextDouble();
			tr1.setBaseMenor(baseMenor);
			System.out.print("Defina a base maior: ");
			double baseMaior = leitor.nextDouble();
			tr1.setBaseMaior(baseMaior);
			System.out.print("Defina a altura: ");
			double altura = leitor.nextDouble();
			tr1.setAltura(altura);
			tr1.mostrarDados();
		}
		
		if (opcao == 4) {
			
			Triangulo t1 = new Triangulo();
			
			System.out.print("Defina a base: ");
			double base = leitor.nextDouble();
			t1.setBase(base);
			System.out.print("Defina a altura: ");
			double altura = leitor.nextDouble();
			t1.setAltura(altura);
			t1.mostrarDados();
		}
		
		if (opcao == 5) {
			
			Circuferencia c1 = new Circuferencia();
			
			System.out.print("Defina o raio: ");
			double raio = leitor.nextDouble();
			c1.setRaio(raio);
			c1.mostrarDados();
		}
	}
}
