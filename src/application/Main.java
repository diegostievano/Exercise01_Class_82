package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Main {
	/*Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do 
	titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
	inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
	conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
	
	Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
	o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
	exemplo).
	 
	Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
	isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
	realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
	suficiente para realizar o saque e/ou pagar a taxa.
	
	Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
	informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
	mostrando os dados da conta após cada operação.  
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		Account conta;
		
		System.out.print("Enter Account Number:");
		int accountNumber = input.nextInt();
		
		System.out.print("Enter Account Holder:");
		String accountHolder = input.next();
		
		//Account conta = new Account(accountNumber);
		
		System.out.print("Would like to do initial deposit (y/n)?");
		char anwser = input.next().charAt(0);		
		
		if (anwser == 'y') {
			System.out.print("Enter Initial deposit: ");
			double initialDeposit = input.nextDouble();
			conta = new Account(accountNumber, initialDeposit);
		}
		else {
			conta = new Account(accountNumber, accountHolder);
		}			
		
		//conta.setAccountOwner(accountHolder);
		
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double cash = input.nextDouble();
		conta.deposit(cash);
		
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		cash = input.nextDouble();
		conta.takeCash(cash);
		
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		input.close();
	}

}
