package com.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	double gasolina, alcool, precoGasolina = 3.3, precoAlcool = 2.9;
	char combustivel;

	Scanner sc = new Scanner(System.in);
	
	do {
	System.out.println("Voc� deseja abastecer com Alcool ou Gasolina? \n(A para Alcool / G para Gasolina)");
	combustivel = sc.next().charAt(0);

	if (combustivel != 'A' && combustivel != 'a'&& combustivel != 'G' && combustivel != 'g'){
	 System.out.println("Valor digitado inv�lido!");
		} 
	}
	while(combustivel != 'A' && combustivel != 'a'&& combustivel != 'G' && combustivel != 'g');
	
	if(combustivel == 'A' || combustivel == 'a') {
		System.out.println("Digite a quantidade de alcool para ser abastecido: ");
		alcool = sc.nextDouble();	
		alcool = alcool * precoAlcool;
	
		System.out.println("Voc� dever� pagar o total de: " + alcool + " reais!");
	} else {
		System.out.println("Digite a quantidade de gasolina para ser abastecido: ");
		gasolina = sc.nextDouble();
		gasolina = gasolina * precoGasolina;
	

		System.out.println("Voc� dever� pagar o total de: " + gasolina + " reais!");	
	}
	
	sc.close();
	
	}

}
