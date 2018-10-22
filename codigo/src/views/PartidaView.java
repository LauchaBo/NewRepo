package views;

import java.util.ArrayList;

import negocio.Mano;
import negocio.Mazo;

public class PartidaView {
	private int puntosTotalA;
	private int puntosTotalB;
	private MazoView mazo;
	private boolean finalizado;
	private int ganador;
	private ArrayList<ManoView> manos;
	private ManoView manoActiva;
	
	public PartidaView(int puntosTotalA, int puntosTotalB, Mazo mazo, boolean finalizado, int ganador, ArrayList<Mano> manos, Mano manoActiva) {
		this.puntosTotalA = puntosTotalA;
		this.puntosTotalB = puntosTotalB;
		this.mazo = mazo.getView();
		this.finalizado = finalizado;
		this.ganador = ganador;
		this.manoActiva = manoActiva.getView();
		for(Mano m:manos)
			this.manos.add(m.getView());
	}

	public int getPuntosTotalA() {
		return puntosTotalA;
	}

	public int getPuntosTotalB() {
		return puntosTotalB;
	}

	public MazoView getMazo() {
		return mazo;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public int getGanador() {
		return ganador;
	}

	public ArrayList<ManoView> getManos() {
		return manos;
	}

	public ManoView getManoActiva() {
		return manoActiva;
	}
}
