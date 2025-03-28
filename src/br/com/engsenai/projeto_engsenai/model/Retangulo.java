package br.com.engsenai.projeto_engsenai.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base) {
		this.base = base;
	}
		
	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	private double calcularPerimetro() {
		double perimetro;
		perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}
	
	private double calcularArea() {
		double area;
		area = base * altura;
		return area;
	}
	
	public void mostrarDados() {
		System.out.println("------------------------------------");
		System.out.println("RETANGULO");
		System.out.println("------------------------------------");
		System.out.println("Altura =      " + altura);
		System.out.println("Base =        " + base);
		System.out.println("Perimetro =   " + calcularPerimetro());
		System.out.println("Area =        " + calcularArea());
		System.out.println("------------------------------------");
	}
}
