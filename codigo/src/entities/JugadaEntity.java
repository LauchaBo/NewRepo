package entities;

import javax.persistence.*;

@Entity
@Table(name="Jugadas")
public class JugadaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idJugada;
	@OneToMany
	@JoinColumn (name="idCarta")
	private CartaEntity carta;
	@OneToMany
	@JoinColumn(name="idUsuario")
	private JugadorEntity jugador;
	
	public JugadaEntity() {
		
	}
	
	public JugadaEntity(CartaEntity carta, JugadorEntity jugador) {
		super();
		this.carta = carta;
		this.jugador = jugador;
	}

	public void setCarta(CartaEntity carta) {
		this.carta = carta;
	}

	public void setJugador(JugadorEntity jugador) {
		this.jugador = jugador;
	}

	public CartaEntity getCarta() {
		return carta;
	}

	public JugadorEntity getJugador() {
		return jugador;
	}

}
