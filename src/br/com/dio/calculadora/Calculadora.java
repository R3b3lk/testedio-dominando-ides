package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a, b;
		
		System.out.println("Digite o Primeiro valor: ");
		a = (Double) scan.nextDouble();
		System.out.println("Digite o Segundo valor: ");
		b = (Double) scan.nextDouble();
		
		Double soma = soma(a,b);
		Double subtracao = subtracao(a,b);
		Double multiplicacao = multiplicacao(a,b);
		Double divisao = divisao(a,b);
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
	}

	public static Double soma(Double a, Double b) {
		return a + b;
	}
	public static Double subtracao(Double a, Double b) {
		return a - b;
	}
	public static Double divisao(Double a, Double b) {
		return a / b;
	}
	public static Double multiplicacao(Double a, Double b) {
		return a * b;
	}
		
}
