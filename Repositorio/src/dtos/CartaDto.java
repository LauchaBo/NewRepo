package dtos;

import java.io.Serializable;

public class CartaDto  implements Serializable{
	
	private static final long serialVersionUID = -8246060271849321893L;
	private int numero;
	private String palo;
	private boolean disponible;
	private int ranking;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//

	
	public CartaDto(int numero, String palo, int ranking, boolean disponible) {
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

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
}
