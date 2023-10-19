package com.java;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 {

	public static void main(String[] args) {
		double mediaSalario=0, mediaFilhos=0;
		int numFilhos, i=0, h=1;
		double[] maiorSalario = new double[10];
		boolean negativo = true;
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Qual o salário do habitante " + h);
		maiorSalario[i] = sc.nextDouble();
		System.out.println("Qual a quantidade de filhos do habitante " + h);
		numFilhos = sc.nextInt();
		
		mediaFilhos += (numFilhos / h);
		mediaSalario += (maiorSalario[i] / h);
		
		if(maiorSalario[i] < 0) {
			negativo = false;
		}
		
		i++;
		h++;
		} while(negativo);
		
		System.out.println(mediaFilhos);
		
		sc.close();
	}

}
