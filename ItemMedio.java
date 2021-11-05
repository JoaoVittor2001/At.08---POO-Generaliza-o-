package Item;

public class ItemMedio {

	public static void main(String[] args) {
	
			Livro livroteste = new Livro (1,"livroteste","Emilio");
			
			System.out.println("Livro : " + livroteste.getAutor());

		    Midia midiateste = new Midia (2,"midiateste","grava rio",3);
		    
			System.out.println("Midia =  " +"Gravadora : "+ midiateste.getGravadora() +", Duração : " + midiateste.getDuracao());
			
			CD cdteste = new CD (3,"cdteste","gravadoracd",3,10,"Luancd","albumcd");
			
			System.out.println("CD = " + "Faixa : " +cdteste.getFaixas() +", Artista : " + cdteste.getArtista() +", Album : "+ cdteste.getAlbum());

			VHS vhsteste = new VHS (4,"vhsteste","gravadoravhs",4,"tituloVHS");
			System.out.println("VHS Titulo : " + vhsteste.getTitulo());
		}
	}