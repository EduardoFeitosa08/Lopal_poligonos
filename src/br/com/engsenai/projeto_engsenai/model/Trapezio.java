package br.com.engsenai.projeto_engsenai.model;

public class Trapezio {
	
	private double baseMenor;
	private double baseMaior;
	private double altura;
	
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMenor;
	}
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	private double calcularArea() {
		double area;
		area = ((baseMaior + baseMenor) * altura)/2;
		return area;
		
	}
	
	public void mostrarDados() {
		System.out.println("------------------------------------");
		System.out.println("TRAPÉZIO");
		System.out.println("------------------------------------");
		System.out.println("Altura =      " + altura);
		System.out.println("Base Maior =  " + baseMaior);
		System.out.println("Base Menor =  " + baseMenor);
		System.out.println("Area =        " + calcularArea());
		System.out.println("------------------------------------");
}

}
