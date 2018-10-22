package dtos;

import java.io.Serializable;
import java.util.ArrayList;

import negocio.Carta;

public class MazoDto implements Serializable{
	
	private static final long serialVersionUID = -7369327764593237312L;
	ArrayList<CartaDto> cartasMazo;
	private int cantidad;
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	public MazoDto (ArrayList<Carta> cartas, int cantidad) {
		for (Carta carta:cartas) {
			CartaDto cv=carta.getView();
			this.cartasMazo.add(cv);
		}
		this.cantidad=cantidad;
	}
	
	//--------------------------------------------------------------------------------------------------//
	//										//Constructor//													//
	//--------------------------------------------------------------------------------------------------//
	
	public ArrayList<CartaDto>getMazoView() {
		return cartasMazo;
	}
	public int getCantidad() {
		return cantidad;
	}

	public void setCartasMazo(ArrayList<CartaDto> cartasMazo) {
		this.cartasMazo = cartasMazo;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
