package entities;

public class Account {
	/*Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do 
	titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito 
	inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua 
	conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
	
	Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� 
	o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por 
	exemplo).
	 
	Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger 
	isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque 
	realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for 
	suficiente para realizar o saque e/ou pagar a taxa.
	
	Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o 
	informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre 
	mostrando os dados da conta ap�s cada opera��o.  
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
