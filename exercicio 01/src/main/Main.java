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
		System.out.println("A média aritmetica é: "+num.mediaAritmetica());
		System.out.println("Os pares são: " + num.pares());
		System.out.println("Os impares são: " + num.impares());
		System.out.println("A média geométrica é: " + num.mediaGeometrica());
		
	}

}
