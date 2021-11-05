package Conta;

public class ContaEspecial extends Conta {

	private int juros;
	private double limite;

	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int jurosespecial,double limiteespecial) {
		super(banco,agencia,numeroconta,saldo);
		juros = jurosespecial;
		limite = limiteespecial;
	}
	public int getJuros() {
		return juros;
	}
	public void setJuros(int juros) {
		this.juros = juros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
}