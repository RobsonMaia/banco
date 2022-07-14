package gnbbank;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Teste de alteração na branch");


		Conta conta1 = new Conta();
		conta1.agencia = 12345;
		conta1.numConta = 123;
		conta1.saldo = 500;
		conta1.titular = "Robson Maia";
		System.out.println("-----------------");
		System.out.println("      CONTA      ");
		System.out.println("-----------------");
		System.out.println("   ");
		System.out.println("TITULAR: " + conta1.titular);
		System.out.println("Qual opeera��o deseja realizar?");
		System.out.println("[1] SAQUE");
		System.out.println("[2] DEPOSITO");
		int cont = sc.nextInt();
		switch (cont) {
		case 1:
			System.out.println("INFORME A SENHA:");
			senha = sc.nextInt();
			while (senha != 2022) {
				System.out.println("SENHA INVALIDA!");
				senha = sc.nextInt();	
			}
			System.out.println("ACESSO PERMITIDO :)");
			System.out.print(conta1.titular + " Valor do saque: R$");
			double saque = sc.nextDouble();
			conta1.sacar(saque);
			System.out.println("   ");
			System.out.println("CONTA ATUALIZADA: " + conta1);
		break;
		case 2:
			System.out.println("INFORME A SENHA:");
			senha = sc.nextInt();
			while (senha != 2022) {
				System.out.println("SENHA INVALIDA!");
				senha = sc.nextInt();	
			}
			System.out.println("ACESSO PERMITIDO :)");
			System.out.print("Valor do deposito: R$");
			double valor = sc.nextDouble();
			conta1.dopositar(valor);
			System.out.println("   ");
			System.out.println("CONTA ATUALIZADA: " + conta1);
		break;	
		}
		
			
		sc.close();
	}

}
