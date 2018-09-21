package negocio;

public class Jugador {
	private CartasEnMano mano;
	private Usuario jugador;
	private int orden;
	
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
	public Usuario getJugador() {
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
	public JugadorView getView() {
		
	}
	
}
