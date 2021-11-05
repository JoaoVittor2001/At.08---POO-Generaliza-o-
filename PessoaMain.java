package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Marco Antonio do Carmo", "Guilherme Gemballa");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica("Marco Antonio do Carmo", "Guilherme Gemballa", "093.425.419-17", "Noivado");
		System.out.println(pf);

		PessoaJuridica pj = new PessoaJuridica("Cris Maquinas", "Guilherme Gemballa", "24-462-191/0001-71",
				"Serviço Agricola");
		System.out.println(pj);
	}
}