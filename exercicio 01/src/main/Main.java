package main;

import java.util.Scanner;

import model.Numeros;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de numeros: ");
		Numeros num = new Numeros(leitor.nextInt());
		
		for(int i=0; i<num.getQtd();i++) {
			System.out.println("Digite um valor: ");
			num.setNumeros(leitor.nextDouble());
		}
		System.out.println("A m�dia aritmetica �: "+num.mediaAritmetica());
		System.out.println("Os pares s�o: " + num.pares());
		System.out.println("Os impares s�o: " + num.impares());
		System.out.println("A m�dia geom�trica �: " + num.mediaGeometrica());
		
	}

}
