package br.com.engsenai.projeto_engsenai.model;

public class Circuferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	private double calcularCircuferencia() {
		double circuferencia;
		circuferencia = 2 * Math.PI * raio;
		return circuferencia;
	}
	
	private double calcularArea() {
		double area;
		area = Math.PI * (Math.pow(raio, 2));
		return area;
	}
	
	public void mostrarDados() {
	System.out.println("------------------------------------");
	System.out.println("CIRCUFERENCIA");
	System.out.println("------------------------------------");
	System.out.println("Raio =           " + raio);
	System.out.println("Circuferencia =  " + calcularCircuferencia());
	System.out.println("Area =           " + calcularArea());
	System.out.println("------------------------------------");
	}
	
}
