package views;

import java.util.ArrayList;

import negocio.Carta;

public class MazoView {
	ArrayList<CartaView> cartasMazo;
	private int cantidad;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public MazoView (ArrayList<Carta> cartas, int cantidad) {
		for (Carta carta:cartas) {
			CartaView cv=carta.getView();
			this.cartasMazo.add(cv);
		}
		this.cantidad=cantidad;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	
	public ArrayList<CartaView>getMazoView() {
		return cartasMazo;
	}
	public int getCantidad() {
		return cantidad;
	}
}
