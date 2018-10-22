package dtos;

import java.io.Serializable;

import negocio.CartasEnMano;
import negocio.Usuario;

public class JugadorDto implements Serializable {
	
	private static final long serialVersionUID = -4889385566057424439L;
	private UsuarioDto jugador;
	private CartasEnManoDto mano;
	private int orden;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public JugadorDto(CartasEnMano mano, Usuario jugador, int orden) {
		this.jugador=jugador.getView();
		this.mano=mano.getView();
		this.orden=orden;
	}
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	public UsuarioDto getJugador() {
		return jugador;
	}
	public CartasEnManoDto getCartasManoView() {
		return mano;
	}
	public int getOrden() {
		return orden;
	}
	public void setJugador(UsuarioDto jugador) {
		this.jugador = jugador;
	}
	public void setMano(CartasEnManoDto mano) {
		this.mano = mano;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}

}
