package views;

import negocio.Carta;
import negocio.Jugador;

public class JugadaView {
	private CartaView carta;
	private JugadorView jugador;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public JugadaView(Carta carta, Jugador jugador) {
		this.carta=carta.getView();
		this.jugador=jugador.getView();
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public CartaView getCartaJugada() {
		return carta;
	}
	public JugadorView getJugadorJugada() {
		return jugador;
	}
}
