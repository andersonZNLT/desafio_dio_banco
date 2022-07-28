package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente anderson = new Cliente();
		anderson.setNome("Anderson");
		
		Conta cc = new ContaCorrente(anderson);
		Conta poupanca = new ContaPoupanca(anderson);

		cc.depositar(100);
		cc.transferir(20, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();	
	}

}
