package views;

import negocio.CartasEnMano;
import negocio.Usuario;

public class JugadorView {
	private UsuarioView jugador;
	private CartasEnManoView mano;
	private int orden;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public JugadorView(CartasEnMano mano, Usuario jugador, int orden) {
		this.jugador=jugador.getView();
		this.mano=mano.getView();
		this.orden=orden;
	}
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	public UsuarioView getJugador() {
		return jugador;
	}
	public CartasEnManoView getCartasManoView() {
		return mano;
	}
	public int getOrden() {
		return orden;
	}

}
