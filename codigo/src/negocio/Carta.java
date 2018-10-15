package negocio;

import views.CartaView;

public class Carta {
	private int numero;
	private String palo;
	private boolean disponible;
	private int ranking;
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public Carta(int nro, String palo, int ranking) {
		this.numero=nro;
		this.palo=palo;
		this.ranking=ranking;
		this.disponible=true;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTurno() {
		return palo;
	}
	public void setTurno(String palo) {
		this.palo = palo;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public void tomarCarta() {
		this.disponible=false;
	}
	public CartaView getView () {
		CartaView view=new CartaView(this.numero,this.palo,this.ranking,this.disponible);
		return view;
	}

}
