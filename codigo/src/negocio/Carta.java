package negocio;

import views.CartaView;

public class Carta {
	private int numero;
	private String palo;
	private int ranking;
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public Carta(int nro, String palo) {
		this.numero=nro;
		this.palo=palo;
		//sacar de la DB
		//this.ranking=ranking;
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
	
	public CartaView getView () {
		CartaView view=new CartaView(this.numero,this.palo,this.ranking,this.disponible);
		return view;
	}
}
