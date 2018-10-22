package entities;

import javax.persistence.*;

public class JugadorEntity {
	
	private UsuarioEntity jugador;
	private CartasEnManoEntity mano;
	private int orden;
	
	public JugadorEntity() {
	}
	public JugadorEntity(UsuarioEntity jugador, CartasEnManoEntity mano, int orden) {
		super();
		this.jugador = jugador;
		this.mano = mano;
		this.orden = orden;
	}
	public void setJugador(UsuarioEntity jugador) {
		this.jugador = jugador;
	}
	public void setMano(CartasEnManoEntity mano) {
		this.mano = mano;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}

	public UsuarioEntity getJugador() {
		return jugador;
	}
	public CartasEnManoEntity getMano() {
		return mano;
	}
	public int getOrden() {
		return orden;
	}
	
}
