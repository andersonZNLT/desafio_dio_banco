package desafio_dio_banco;

import java.util.List;

public class Banco {

	private String nomeBanco;
	private List<Conta> contas;
		
	//get
	public String getNomeBanco() {
		return nomeBanco;
	}
	//set
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
		
	//get
	public List<Conta> getContas() {
		return contas;
	}
	
	//set
	public void setContas(List<Conta> contas) {
		//this.contas = contas;
		contas.add((Conta) contas);
		System.out.println(String.format("nome das contas: %s", contas));
	}

}
