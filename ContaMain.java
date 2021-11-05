package Conta;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta c = new Conta("Banco do Brasil", 666, 216, 0);
		if (c.deposito(1000));
		System.out.println("Deposito OK");
		System.out.println(c.deposito(-100));
		System.out.println(c.saque(100));
		System.out.println(c.saque(901));
		System.out.println(c);

		ContaSimples cs = new ContaSimples("Itau", 456, 654, 100);
		System.out.println(cs.depositoPoupanca(-40000));
		System.out.println(cs.saquePoupanca(-40000));
		System.out.println(cs);

		ContaEspecial ce = new ContaEspecial("Bradesco", 1215, 12340, -350, 5, 0);
		System.out.println(ce);
	}
}