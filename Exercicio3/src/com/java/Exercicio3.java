package com.java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int contador=1, estoque;
		double valorMercadoria, valorTotal=0, mediaTotal;
		char maisMercadoria;
		
		Scanner sc = new Scanner(System.in);
		
		do {
		System.out.println("Qual a quantidade total de mercadorias no estoque: ");
		estoque = sc.nextInt();
		
		if(estoque < 0) {
			System.out.println("Valor inválido!");
		}
		
		} while (estoque < 0);
		
		do {
		do {
			System.out.println("Digite o valor da mercadoria: " + contador);
			valorMercadoria = sc.nextDouble();
			valorTotal += valorMercadoria;
			contador++;
		} while (contador <= estoque);
		
		System.out.println("Deseja adicionar mais mercadorias? \n(S para SIM / N para Não)");
		maisMercadoria = sc.next().charAt(0);
		
		} while (maisMercadoria == 's' || maisMercadoria == 'S');
		
		
		mediaTotal = valorTotal / estoque;
		
		System.out.println("Valor total em estoque igual a: " + valorTotal);
		System.out.println("Média de valor das mercadorias igual a: " + mediaTotal);
		
		
		sc.close();
	}

}
