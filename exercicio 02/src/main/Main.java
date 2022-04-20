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
		System.out.println("As diagonais principais  de AXB s�o: " + mat.diagonalPrincipalAXB());
		System.out.println("As diagonais principais de Cxd s�o: " + mat.diagonalPrincipalCXD()+ "\n");
		System.out.println("As diagonas secundaria de AXB s�o: " + mat.diagonalSecundariaAXB());
		System.out.println("As diagonais secundarias de CXD sa�: " + mat.diagonalSecundariaCXD());
		double soma[][] = mat.soma();
		if(Objects.isNull(soma)) {
			System.out.println("\nN�o � possivel somar as matrizes");
		}else {
			System.out.println("\nA soma das matriz AXB + CXD �: ");
			for(int i=0;i<mat.getA();i++) {
				for(int j=0;j<mat.getB();j++) {
					System.out.print(soma[i][j]+" ");
	
				}
				System.out.println();
				
			}
		}
		System.out.println("\nA matriz trasposta de AXB �: ");
		double transpostaAXB[][]= mat.transpostaAXB();
		for(int i=0;i<mat.getA();i++) {
			for(int j=0;j<mat.getB();j++) {
				System.out.print(transpostaAXB[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("\nA matriz trasposta de CXD �: ");
		double transpostaCXD[][]= mat.transpostaCXD();
		for(int i=0;i<mat.getA();i++) {
			for(int j=0;j<mat.getB();j++) {
				System.out.print(transpostaCXD[i][j]+" ");
			}
			System.out.println();
		}
		double multiplicacao[][] = mat.multiplicacao();
		if(Objects.isNull(multiplicacao)) {
			System.out.println("\nN�o � possivel multiplicar as matrizes");
		}else {
			System.out.println("\nA multiplica��o das matrizes AXB * CXD �: ");{
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
