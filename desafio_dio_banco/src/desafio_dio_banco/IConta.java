package desafio_dio_banco;

//Criamos uma interface pois estes dados servem para conta poupanca e corrente
public interface IConta {
	
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Conta contaDestino);
	
	void imprimirExtrato();
}
