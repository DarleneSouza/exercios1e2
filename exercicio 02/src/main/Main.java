package main;

import java.util.Objects;
import java.util.Scanner;

import model.Matrizes;

public class Main {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner leitor = new Scanner(System.in);
		System.out.println("matriz AXB");
		System.out.println("Digite a qtd de linhas: ");
		a = leitor.nextInt();
		System.out.println("Digite a qtd de colunas: ");
		b = leitor.nextInt();
		System.out.println();
		System.out.println("matriz CXD");
		System.out.println("Digite a qtd de linhas: ");
		c = leitor.nextInt();
		System.out.println("Digite a qtd colunas: ");
		d = leitor.nextInt();
		System.out.println();
		Matrizes mat = new Matrizes(a,b,c,d);
		for(int i=0;i<mat.getA();i++) {
			for(int j=0;j<mat.getB();j++) {
				System.out.println("Digite o valor para matriz AXB 1:" +i+ "," + j);
				mat.setMatrizAXB(i, j, leitor.nextDouble());
			}
		}
		System.out.println();
		for(int i=0;i<mat.getC();i++) {
			for(int j=0;j<mat.getD();j++) {
				System.out.println("Digite o valor para matriz CXD 2:" +i+ "," + j);
				mat.setMatrizCXD(i, j, leitor.nextDouble());
			}
		}
		System.out.println("As diagonais principais  de AXB são: " + mat.diagonalPrincipalAXB());
		System.out.println("As diagonais principais de Cxd são: " + mat.diagonalPrincipalCXD()+ "\n");
		System.out.println("As diagonas secundaria de AXB são: " + mat.diagonalSecundariaAXB());
		System.out.println("As diagonais secundarias de CXD saõ: " + mat.diagonalSecundariaCXD());
		double soma[][] = mat.soma();
		if(Objects.isNull(soma)) {
			System.out.println("\nNão é possivel somar as matrizes");
		}else {
			System.out.println("\nA soma das matriz AXB + CXD é: ");
			for(int i=0;i<mat.getA();i++) {
				for(int j=0;j<mat.getB();j++) {
					System.out.print(soma[i][j]+" ");
	
				}
				System.out.println();
				
			}
		}
		System.out.println("\nA matriz trasposta de AXB é: ");
		double transpostaAXB[][]= mat.transpostaAXB();
		for(int i=0;i<mat.getA();i++) {
			for(int j=0;j<mat.getB();j++) {
				System.out.print(transpostaAXB[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("\nA matriz trasposta de CXD é: ");
		double transpostaCXD[][]= mat.transpostaCXD();
		for(int i=0;i<mat.getA();i++) {
			for(int j=0;j<mat.getB();j++) {
				System.out.print(transpostaCXD[i][j]+" ");
			}
			System.out.println();
		}
		double multiplicacao[][] = mat.multiplicacao();
		if(Objects.isNull(multiplicacao)) {
			System.out.println("\nNão é possivel multiplicar as matrizes");
		}else {
			System.out.println("\nA multiplicação das matrizes AXB * CXD é: ");{
				for(int i=0;i<mat.getA();i++) {
					for(int j=0;j<mat.getD();j++) {
						System.out.print(multiplicacao[i][j]+" ");
					}
					System.out.println();
				}
			}
		}
	}

}
