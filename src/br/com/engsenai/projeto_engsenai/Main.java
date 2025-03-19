package br.com.engsenai.projeto_engsenai;

import br.com.engsenai.projeto_engsenai.model.Circuferencia;
import br.com.engsenai.projeto_engsenai.model.Quadrado;
import br.com.engsenai.projeto_engsenai.model.Retangulo;
import br.com.engsenai.projeto_engsenai.model.Trapezio;
import br.com.engsenai.projeto_engsenai.model.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q1 = new Quadrado();
		q1.setLado(5);
		q1.mostrarDados();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		
		Retangulo r1 = new Retangulo();
		r1.setBase(2);
		r1.setAltura(10);
		r1.mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1.setBase(4);
		t1.setAltura(5);
		t1.mostrarDados();
		
		Trapezio z1 = new Trapezio();
		z1.setBaseMaior(6);
		z1.setBaseMenor(3);
		z1.setAltura(4);
		z1.mostrarDados();
		
		Circuferencia c1 = new Circuferencia();
		c1.setRaio(4);
		c1.mostrarDados();
		
		}

}
