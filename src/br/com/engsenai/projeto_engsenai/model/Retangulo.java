package br.com.engsenai.projeto_engsenai.model;

public class Retangulo {
	
	private double base;
	private double altura;
	
	public void setBase(double base) {
		if(base < 0) {
			this.base = 1;
		}else {
			this.base = base;
		}
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro = (2 * base) + (2 * altura);
		return perimetro;
	}
	
	public double calcularArea() {
		double area;
		area = base * altura;
		return area;
		
	}
	
	public void mostrardados() {
		System.out.println("------------------------------------");
		System.out.println("Lado =      " + lado);
		System.out.println("Perimetro = " + calcularPerimetro() );
		System.out.println("Area =      " + calcularArea());
		System.out.println("------------------------------------");
	}
}
