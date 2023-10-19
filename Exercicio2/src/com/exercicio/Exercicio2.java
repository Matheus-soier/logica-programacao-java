package com.exercicio;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int contador=1, estoque;
		double valorMercadoria, valorTotal=0, mediaTotal;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Qual a quantidade total de mercadorias no estoque: ");
		estoque = sc.nextInt();
		
		if(estoque < 0) {
			System.out.println("Valor inválido!");
		}
		
		} while (estoque < 0);
		
		do {
			System.out.println("Digite o valor da mercadoria: " + contador);
			valorMercadoria = sc.nextDouble();
			valorTotal += valorMercadoria;
			contador++;
		} while (contador <= estoque);
		
		mediaTotal = valorTotal / estoque;
		
		System.out.println("Valor total em estoque igual a: " + valorTotal);
		System.out.println("Média de valor das mercadorias igual a: " + mediaTotal);
		
		
		sc.close();

	}

}
