package dtos;

import java.io.Serializable;
import java.util.ArrayList;

import negocio.Carta;

public class CartasEnManoDto implements Serializable {
	
	private static final long serialVersionUID = 7637317347349989988L;
	private ArrayList<CartaDto> cartasEnMano;
	private int cantCartas;
	private int envido;
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//	
	public CartasEnManoDto (ArrayList<Carta> cartasEnMano, int cantCartas, int envido) {
		for(Carta cartaActual : cartasEnMano ) { //Creo los view de cada carta
			CartaDto cv=cartaActual.getView();
			this.cartasEnMano.add(cv);
		}
		this.cantCartas= cantCartas;
		this.envido=envido;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public ArrayList<CartaDto> getCartasEnMano(){
		return cartasEnMano;
	}
	public int getCantCartas() {
		return cantCartas;
	}
	public int getEnvido() {
		return envido;
	}

	public void setCartasEnMano(ArrayList<CartaDto> cartasEnMano) {
		this.cartasEnMano = cartasEnMano;
	}

	public void setCantCartas(int cantCartas) {
		this.cantCartas = cantCartas;
	}

	public void setEnvido(int envido) {
		this.envido = envido;
	}

}
