package com.loiane.cursojavabasico.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		
		//Programa de folha de pagamento.
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Digite quanto é seu valor hora trabalhado:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Digite quantas horas você trabalha no mês:");
		double qtdHoras = scan.nextDouble();

		double salarioBruto = valorHora * qtdHoras;
			
		int DescontoIr = 0;
		if(salarioBruto <=900) {
			DescontoIr = 0;
		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
			DescontoIr = 5;
		}else if(salarioBruto >1500 && salarioBruto <= 2500) {
			DescontoIr = 10;
		}else if(salarioBruto > 2500) {
			DescontoIr = 20;
		}
		
		double ir = (salarioBruto/100) * DescontoIr;
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: (" + valorHora + "*" + qtdHoras + "):" + salarioBruto);
		System.out.println("(-) IR (" + DescontoIr + "%): " + ir );
		System.out.println("(-) INSS (10%): " + inss);
		System.out.println("(-) FGTS (11%): " + fgts);
		System.out.println("Total de descontos:  " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
