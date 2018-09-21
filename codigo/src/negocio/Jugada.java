package negocio;

public class Jugada {
	private Carta carta;
	private Jugador jugador;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public Jugada (Jugador jugador, Carta carta) {
		this.carta=carta;
		this.jugador=jugador;
	}
	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//
	
	public Carta getCarta() {
		return carta;
	}

	public void setCarta(Carta carta) {
		this.carta = carta;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public int rankingJugada() {
		return this.carta.getRanking();
	}
	
	

}
