package negocio;

import java.util.ArrayList;

public class CartasEnMano {
	private ArrayList<Carta> cartasEnMano;
	private int cantCartas;
	private int envido;
	public ArrayList<Carta> getCartasEnMano() {
		return cartasEnMano;
	}
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//												//
	//--------------------------------------------------------------------------------------------------//
	
	
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	public void setCartasEnMano(ArrayList<Carta> cartasEnMano) {
		this.cartasEnMano = cartasEnMano;
	}
	public int getCantCartas() {
		return cantCartas;
	}
	public void setCantCartas(int cantCartas) {
		this.cantCartas = cantCartas;
	}
	public int getEnvido() {
		return envido;
	}
	public void setEnvido(int envido) {
		this.envido = envido;
	}
	public void jugarCarta(int numero, String palo){
		
	}
	public CartasEnManoView getView() {
		
	}

}
