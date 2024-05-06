package desafio;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SimulacaoBancaria {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			
			double saldo = 0;
			double saldoAtual = 0;
			// Loop infinito para manter o programa em execução até que o usuário decida
			// sair
			boolean encerrar = true;
			while (encerrar) {
				
				int opcao = scanner.nextInt();
				// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
				// Dica: Utilze o switch/case para o programa realizar as operações escolhidas
				// pelo usuário.

				switch (opcao) {
				case 1: {
					saldo = scanner.nextDouble();
					saldoAtual += saldo;
					System.out.println("Saldo atual: "+ saldoAtual);
					break;
				}
				case 2: {
					saldo = scanner.nextDouble();
					if (saldoAtual>saldo) {
						saldoAtual -= saldo;
						System.out.println("Saldo atual: "+ saldoAtual);
					}else {
						System.out.println("Saldo insuficiente.");					
					}
					break;
				}
				case 3: {
					System.out.println("Saldo atual: " + saldoAtual);
					break;
				}
				case 0: {
					System.out.println("Programa encerrado.");
					encerrar = false;
					break;
				}
				default:
					// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
					System.out.print("Opcao invalida. Escolha uma opcao correta: ");
					opcao = scanner.nextInt();
				}
			}
			scanner.close();
		} catch (InputMismatchException e) {
			System.out.println("Dados informado invalidos.");
		}
			
	}
}
