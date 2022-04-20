package model;

import java.util.ArrayList;

public class Matrizes {
	private double matrizAXB[][];
	private double matrizCXD[][];
	private int a;
	private int b;
	private int c;
	private int d;
	
	public Matrizes(int a,int b,int c,int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		matrizAXB = new double[a][b];
		matrizCXD = new double[c][d];
	}
	public int getA() {
		return a;		
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getD() {
		return d;
	}
	public double[][] getMatrizAXB() {
		return matrizAXB;
	}
	public double[][] getMatrixCXD(){
		return matrizCXD;
	}
	public void setMatrizAXB(int i,int j,double valor) {
		this.matrizAXB[i][j]= valor;
	}
	public void setMatrizCXD(int i,int j, double valor) {
		this.matrizCXD[i][j]= valor;
	}
	public ArrayList<Double> diagonalPrincipalAXB(){
		ArrayList<Double> diagonalPrincipal = new ArrayList<>();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(i==j) {
					diagonalPrincipal.add(matrizAXB[i][j]);
				}
			}
		}
		return diagonalPrincipal;
	}
	public ArrayList<Double> diagonalPrincipalCXD(){
		ArrayList<Double> diagonalPrincipal = new ArrayList<>();
		for(int i=0;i<c;i++) {
			for(int j=0;j<d;j++) {
				if(i==j) {
					diagonalPrincipal.add(matrizCXD[i][j]);
				}
			}
		}
		return diagonalPrincipal;
	}
	public ArrayList<Double> diagonalSecundariaAXB(){
		ArrayList<Double> diagonalSecundaria = new ArrayList<>();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(i+j == b-1) {
					diagonalSecundaria.add(matrizAXB[i][j]);
				}
			}
		}
		return diagonalSecundaria;
	}
	public ArrayList<Double>diagonalSecundariaCXD(){
		ArrayList<Double>diagonalSecundaria = new ArrayList<>();
		for(int i=0;i<c;i++) {
			for(int j=0;j<d;j++) {
				if(i+j == d-1) {
					diagonalSecundaria.add(matrizCXD[i][j]);
				}
			}
		}
		return diagonalSecundaria;
	}
	public double[][] soma(){
		if(a==c && b==d) {
			double soma[][]= new double[a][b];
			for(int i=0;i<a;i++) {
				for(int j=0;j<b;j++) {
					soma[i][j] = matrizAXB[i][j]+ matrizCXD[i][j];
				}
			}
			return soma;
		}
		else {
			return null;
		}
	}
	public double[][] transpostaAXB(){
		double transpostaAXB[][]= new double[b][a];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				transpostaAXB[j][i]= matrizAXB[i][j];
			}
		}
		return transpostaAXB;
	}
	public double[][]transpostaCXD(){
		double transpostaCXD[][] = new double[d][c];
		for(int i=0;i<c;i++) {
			for(int j=0;j<d;j++) {
				transpostaCXD[j][i]= matrizCXD[i][j];
			}
		}
		return transpostaCXD;
	}
	public double[][]multiplicacao(){
		double multiplicacao[][] = new double[a][d];
		if(a==d && b==c) {
			for(int i=0;i<a;i++) {
				for(int j=0;j<d;j++) {
					double soma = 0;
					for(int k=0;k<b;k++) {
						soma += matrizAXB[i][k]*matrizCXD[k][j];
					}
					multiplicacao[i][j] = soma;
					
				}
			}
			return multiplicacao;
		}else {
			return null;
		}
		
	}
	
	
}

