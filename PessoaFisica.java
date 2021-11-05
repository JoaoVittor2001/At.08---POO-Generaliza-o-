package Pessoa;

public class PessoaFisica extends Pessoa {

	public PessoaFisica(String nomepessoa, String enderecopessoa, String cpfpessoafisica, String estadocivilpessoafisica) {
		super(nomepessoa, enderecopessoa);
		cpf=cpfpessoafisica;
		estadocivil=estadocivilpessoafisica;
	}
	private String cpf;
	private String estadocivil;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	
}