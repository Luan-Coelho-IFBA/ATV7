public class Conta implements Comparable<Conta> {
	private int numero;
	private String titular;
	private double limiteCredito;
	private double saldo;
	
	public Conta(int numero, String titular, double limite, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.limiteCredito = limite;
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Número: " + this.numero);
		System.out.println("Titular: " + this.titular);
		System.out.println("Limite: " + this.limiteCredito);
		System.out.println("Saldo: " + this.saldo);
	}

	@Override
	public int compareTo(Conta o) {
		if (this.numero > o.getNumero()) {
			return 1;
		} else if (this.numero < o.getNumero()) {
			return -1;
		}
		
		return 0;
	}
}
