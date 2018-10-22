package negocio;

import java.util.ArrayList;

import views.ManoView;

public class Mano {
	private int idMano;
	private int puntosA;
	private int puntosB;
	private int envidoMax;
	private boolean envidoCantado;
	private int jugadorMano;
	private ArrayList<Baza> bazas;
	private int bazasGanadasA;
	private int bazasGanadasB;
	private ArrayList<Envite> envites;
	private Baza bazaActiva;
	
	public Mano() {
		//idMano
		this.puntosA = 0;
		this.puntosB = 0;
		this.envidoMax = 0;
		this.envidoCantado = false;
		this.bazas = new ArrayList<Baza>;
		this.bazasGanadasA = 0;
		this.bazasGanadasB = 0;
		this.envites = new ArrayList<Envite>();
		this.bazaActiva = new Baza();
	}
	
	public void calcularGanador() {
		
	}

	public boolean cantarEnvite(int idJugador, int idJuego, int idEnvite) {
		
	}
	
	public void nuevaBaza() {
		Baza nuevaBaza = new Baza();
		bazas.add(bazaActiva);
		bazaActiva = nuevaBaza;
	}
	
	public void jugarCarta(Carta carta, Jugador jugador) {
		bazaActiva.jugarCarta(carta, jugador);
	}
	
	public ManoView getView() {
		ManoView manoView = new ManoView(puntosA, puntosB, envidoMax, envidoCantado, jugadorMano, bazas, bazasGanadasA, bazasGanadasB, envites, bazaActiva);
		return manoView;
	}
	
	public int getIdMano() {
		return idMano;
	}
	
	public int getPuntosA() {
		return puntosA;
	}
	
	public int getPuntosB() {
		return puntosB;
	}
	
	public int getEnvidoMax() {
		return envidoMax;
	}
	
	public boolean isEnvidoCantado() {
		return envidoCantado;
	}
	
	public int getJugadorMano() {
		return jugadorMano;
	}
	
	public ArrayList<Baza> getBazas() {
		return bazas;
	}
	
	public int getBazasGanadasA() {
		return bazasGanadasA;
	}
	
	public int getBazasGanadasB() {
		return bazasGanadasB;
	}
	
	public ArrayList<Envite> getEnvites() {
		return envites;
	}
	
	public Baza getBazaActiva() {
		return bazaActiva;
	}
}
