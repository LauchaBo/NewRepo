package views;

import java.util.ArrayList;

import negocio.Carta;

public class CartasEnManoView {
	private ArrayList<CartaView> cartasEnMano;
	private int cantCartas;
	private int envido;
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//	
	public CartasEnManoView (ArrayList<Carta> cartasEnMano, int cantCartas, int envido) {
		for(Carta cartaActual : cartasEnMano ) { //Creo los view de cada carta
			CartaView cv=cartaActual.getView();
			this.cartasEnMano.add(cv);
		}
		this.cantCartas= cantCartas;
		this.envido=envido;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public ArrayList<CartaView> getCartasEnMano(){
		return cartasEnMano;
	}
	public int getCantCartas() {
		return cantCartas;
	}
	public int getEnvido() {
		return envido;
	}

}
