package negocio;

import java.util.ArrayList;
import java.util.Collections;

import views.MazoView;

public class Mazo {
	private ArrayList<Carta> cartasMazo;
	private int cantidad;

	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	
	public Mazo() {
		//sacar de la DB
		Collections.shuffle(cartasMazo);
	}

	//--------------------------------------------------------------------------------------------------//
	//										//Metodos//													//
	//--------------------------------------------------------------------------------------------------//

	public void removeFirst() {
		cartasMazo.remove(0);
		cantidad -= 1;
	}
	
	public ArrayList<Carta> getCartasMazo() {
		return cartasMazo;
	}
	
	public void setCartasMazo(ArrayList<Carta> cartasMazo) {
		this.cartasMazo = cartasMazo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public MazoView getView() {
		MazoView mazoView=new MazoView(cartasMazo, cantidad);
		return mazoView;
	}
}
