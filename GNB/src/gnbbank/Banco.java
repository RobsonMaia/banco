package gnbbank;

import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta1 = new Conta();
		conta1.agencia = 12345;
		conta1.numConta = 123;
		conta1.saldo = 500;
		conta1.titular = "Robson Maia";
		System.out.println(conta1);
		System.out.print("Valor do deposito: R$");
		double valor = sc.nextDouble();
		conta1.dopositar(valor);
		System.out.println("   ");
		System.out.println("CONTA ATUALIZADA: " + conta1);
		
		System.out.println("   ");
		Conta conta2 = new Conta();
		conta2.agencia = 54321;
		conta2.numConta = 321;
		conta2.saldo = 3000;
		conta2.titular = "Gabriela Barbosa";
		System.out.println(conta2);
		System.out.print("Valor do deposito: R$");
		double valor2 = sc.nextDouble();
		conta2.dopositar(valor2);
		System.out.println("   ");
		System.out.println("CONTA ATUALIZADA: " + conta2);
		
		System.out.println("   ");
		System.out.print(conta1.titular + " Valor do saque: R$");
		double saque = sc.nextDouble();
		conta1.sacar(saque);
		System.out.println("   ");
		System.out.println("CONTA ATUALIZADA: " + conta1);
		
		System.out.println("   ");
		System.out.print(conta2.titular + " Valor do saque: R$");
		double saque1 = sc.nextDouble();
		conta2.sacar(saque1);
		System.out.println("   ");
		System.out.println("CONTA ATUALIZADA: " + conta2);
		

		sc.close();
	}

}
