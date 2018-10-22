package entities;

import java.io.Serializable;
import java.util.ArrayList;

import negocio.Carta;

public class CartasEnManoEntity {
	
	private ArrayList<CartaEntity> cartasEnMano;
	private int cantCartas;
	private int envido;
	
	public CartasEnManoEntity() {
		
	}
	
	public CartasEnManoEntity(ArrayList<CartaEntity> cartasEnMano, int cantCartas, int envido) {
		super();
		this.cartasEnMano = cartasEnMano;
		this.cantCartas = cantCartas;
		this.envido = envido;
	}

	public void setCartasEnMano(ArrayList<CartaEntity> cartasEnMano) {
		this.cartasEnMano = cartasEnMano;
	}

	public void setCantCartas(int cantCartas) {
		this.cantCartas = cantCartas;
	}

	public void setEnvido(int envido) {
		this.envido = envido;
	}

	public ArrayList<CartaEntity> getCartasEnMano() {
		return cartasEnMano;
	}

	public int getCantCartas() {
		return cantCartas;
	}

	public int getEnvido() {
		return envido;
	}

}
