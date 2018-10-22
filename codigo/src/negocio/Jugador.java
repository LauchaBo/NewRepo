package negocio;

import dtos.JugadorDto;

public class Jugador {
	private CartasEnMano mano;
	private Usuario jugador;
	private int orden;
	private int puntosJuego;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//

	
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	public CartasEnMano getMano() {
		return mano;
	}
	public void setMano(CartasEnMano mano) {
		this.mano = mano;
	}
	public Usuario getUsuario() {
		return jugador;
	}
	public void setJugador(Usuario jugador) {
		this.jugador = jugador;
	}
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	public void terminarTurno() {
		
	}
	public JugadorDto getView() {
		JugadorDto jugadorView=new JugadorDto(mano,jugador,orden);
		return jugadorView;
	}
	public int getPuntosJuego() {
		return puntosJuego;
	}
	public void setPuntosJuego(int puntosJuego) {
		this.puntosJuego = puntosJuego;
	}
	
}
