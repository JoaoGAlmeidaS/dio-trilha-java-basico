import java.util.Scanner;


public class ContaTerminal {


	
	String nome;
	double saldo;
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o seu Nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o Numero da Agência: ");
		String agencia = scanner.nextLine();
		
		System.out.println("Digite o Numero da Conta: ");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Digite o Saldo: "); // o separador decimal deve ser ","
		double saldo = scanner.nextDouble();
		
		String stringFormatada = ("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ agencia + ", conta "+ numeroConta + " e seu saldo "+saldo+" já está disponível para saque");

		System.out.println(stringFormatada);
		
		scanner.close();
	}

}
