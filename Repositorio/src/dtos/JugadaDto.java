package dtos;

import java.io.Serializable;

import negocio.Carta;
import negocio.Jugador;

public class JugadaDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9021670569152809041L;
	private CartaDto carta;
	private JugadorDto jugador;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public JugadaDto(Carta carta, Jugador jugador) {
		this.carta=carta.getView();
		this.jugador=jugador.getView();
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public CartaDto getCartaJugada() {
		return carta;
	}
	public JugadorDto getJugadorJugada() {
		return jugador;
	}

	public void setCarta(CartaDto carta) {
		this.carta = carta;
	}

	public void setJugador(JugadorDto jugador) {
		this.jugador = jugador;
	}
}
