package negocio;

import views.JugadorView;

public class Jugador {
	private CartasEnMano mano;
	private Usuario usuario;
	private int orden;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	
	public Jugador(Usuario usuario) {
		this.usuario = usuario;
	}
	
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
		return usuario;
	}
	public void setJugador(Usuario jugador) {
		this.usuario = jugador;
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
		JugadorView jugadorView=new JugadorView(mano, usuario, orden);
		return jugadorView;
	}
	
}
