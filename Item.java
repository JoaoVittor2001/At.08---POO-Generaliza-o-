package Item;

public class Item {

	private int codigo;
	private String descricao;

	public Item(int codigo2, String descricao2) {
		// TODO Auto-generated constructor stub
	}
	public void item (int codigoitem, String descricaoitem) {
		codigo = codigoitem;
		descricao = descricaoitem;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}