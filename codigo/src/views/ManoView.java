package views;

import java.util.ArrayList;

import negocio.Baza;
import negocio.Envite;
import negocio.Jugador;

public class ManoView {
	private int puntosA;
	private int puntosB;
	private int envidoMax;
	private boolean envidoCantado;
	private int jugadorMano;
	private ArrayList<BazaView> bazas;
	private int bazasGanadasA;
	private int bazasGanadasB;
	private ArrayList<EnviteView> envites;
	private BazaView bazaActiva;
	
	public ManoView(int puntosA, int puntosB, int envidoMax, boolean envidoCantado, int jugadorMano, ArrayList<Baza> bazas, int bazasGanadasA, int bazasGanadasB, ArrayList<Envite> envites, Baza bazaActiva) {
		//idMano
		this.puntosA = puntosA;
		this.puntosB = puntosB;
		this.envidoMax = envidoMax;
		this.envidoCantado = envidoCantado;
		//jugadorMano
		for(Baza b:bazas)
			bazaActiva.getView();
		this.bazasGanadasA = bazasGanadasA;
		this.bazasGanadasB = bazasGanadasB;
		this.envites = new ArrayList<Envite>();
		this.bazaActiva = bazaActiva.getView();
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

	public ArrayList<BazaView> getBazas() {
		return bazas;
	}

	public int getBazasGanadasA() {
		return bazasGanadasA;
	}

	public int getBazasGanadasB() {
		return bazasGanadasB;
	}

	public ArrayList<EnviteView> getEnvites() {
		return envites;
	}

	public BazaView getBazaActiva() {
		return bazaActiva;
	}
}
