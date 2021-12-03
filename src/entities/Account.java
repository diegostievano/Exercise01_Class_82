package entities;

public class Account {
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
	private final double tax = 5.00;
	
	private int accountNumer;
	private String accountOwner;
	private double accountTotal;
	
	public Account(){
		
	}	
	
	public Account(int pAccountNumber, String pAccountOwner) {
		this.accountNumer = pAccountNumber;
		this.accountOwner = pAccountOwner;
	}
	
	public Account(int pAccountNumber, double pCash) {
		this.accountNumer = pAccountNumber;
		//this.accountTotal = pCash;
		deposit(pCash);
	}	

	public int getAccountNumer() {
		return accountNumer;
	}

	public String getAccountOwner() {
		return accountOwner;
	}
	
	public double getAccounTotal() {
		return accountTotal;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public void deposit(double pCash) {
		accountTotal += pCash;		
	}
	
	public void takeCash(double pCash) {
		accountTotal -= (pCash + tax);
	}
	
	public String toString() {
		return  "Account " + this.accountNumer + ", " +
				"Holder: " + this.accountOwner + ", " + 
				"Balance: $ " + String.format("%.2f", this.accountTotal);		
	}
}
