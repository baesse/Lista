
public class Conta {

	private int numero;
	// private Cliente titular;
	private double saldo;
	private double limite;

	public void sacar(double quantidade) {
		this.saldo = this.saldo - quantidade;
	}

	public void depositar(double valor) {

		if (valor < 0) {
			throw new IllegalArgumentException("Valor de deposito menor que zero");

		} else {
			
			this.saldo += valor;

		}

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
