package Pessoa;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica(String nomepessoa, String enderecopessoa, String cnpjpessoajuridica, String tipoempresapessoajuridica) {
		super(nomepessoa, enderecopessoa);
		
		cnpj=cnpjpessoajuridica;
		tipoempresa = tipoempresapessoajuridica;
	}

	private String cnpj;
	private String tipoempresa;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getTipoempresa() {
		return tipoempresa;
	}
	public void setTipoempresa(String tipoempresa) {
		this.tipoempresa = tipoempresa;
	}	
}