package br.com.engsenai.projeto_engsenai.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado (double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	private double calcularArea() {
		double area;
		area = Math.pow(lado, 2);
		return area;
	}
	
	private double calcularPerimetro() {
		double perimetro;
		perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados() {
		System.out.println("------------------------------------");
		System.out.println("QUADRADO");
		System.out.println("------------------------------------");
		System.out.println("Lado =        " + lado);
		System.out.println("Perimetro =   " + calcularPerimetro());
		System.out.println("Area =        " + calcularArea());
		System.out.println("------------------------------------");
	}
	
	
	
	
}
