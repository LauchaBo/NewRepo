package views;

public class CartaView {
	private int numero;
	private String palo;
	private boolean disponible;
	private int ranking;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//

	
	public CartaView(int numero, String palo, int ranking, boolean disponible) {
		this.numero=numero;
		this.palo=palo;
		this.ranking=ranking;
		this.disponible=disponible;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public int getNumero() {
		return this.numero;
	}
	public String getPalo() {
		return this.palo;
	}
	public boolean estaDisponible() {
		return this.disponible;
	}
	public int getRanking() {
		return this.ranking;
	}
	
}
