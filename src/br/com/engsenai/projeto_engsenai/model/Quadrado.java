package br.com.engsenai.projeto_engsenai.model;

public class Quadrado {
	
	
	private double lado;
	
	public void setLado(double lado) {
		if(lado < 0) {
			this.lado = 1;
		}else {
			this.lado = lado;
		}
		
	}
	
	public void mostrardados() {
		System.out.println("------------------------------------");
		System.out.println("Lado =      " + lado);
		System.out.println("Perimetro = " + calcularPerimetro() );
		System.out.println("Area =      " + calcularArea());
		System.out.println("------------------------------------");
	}

	private double calcularPerimetro() {
		double perimetro;
		perimetro = 4 * lado;
		return perimetro;
	}
	
	private double calcularArea() {
		double area;
		area = Math.pow(lado, 2);
		return area;
	}
	
		
	
}
