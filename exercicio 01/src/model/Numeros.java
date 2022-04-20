package model;
import java.util.ArrayList;

public class Numeros {
	private ArrayList<Double> numeros = new ArrayList<>();
	private int qtd;
	
	public Numeros(int qtd) {
		this.qtd = qtd;
	}
	public ArrayList<Double> getNumeros(){
		return numeros;
	}
	public int getQtd() {
		return qtd;
	}
	public void setNumeros(double numero) {
		this.numeros.add(numero);
	}
	public double mediaAritmetica() {
		double soma=0;
		for(double numero:numeros) {
			soma = soma+numero;
		}
		return soma/qtd;
	}
	public ArrayList<Double> pares(){
		ArrayList<Double> pares = new ArrayList<>();
		for(double numero:numeros) {
			if(numero %2==0) {
				pares.add(numero);
			}
			
		}
		return pares;
	}
	public ArrayList<Double> impares(){
		ArrayList<Double> impares = new ArrayList<>();
		for(double numero:numeros) {
			if(numero %2!=0) {
				impares.add(numero);
			}
		}
		return impares;
	}
	public double mediaGeometrica() {
		double multiplicar = 1;
		for(double numero:numeros) {
			multiplicar = multiplicar*numero;
		}
		return Math.pow(multiplicar,1/(double)qtd); //inveso da qtd para obter a raiz indice qtd 
		
	}
	
}

