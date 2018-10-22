package entities;
import java.util.ArrayList;

import javax.persistence.*;
@Entity
@Table(name="Mazos")
public class MazoEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMazo;
	private int cantidad;
	@OneToMany
	@JoinColumn (name="idCarta")
	ArrayList<CartaEntity> cartasMazo;
	
	public MazoEntity() {
		
	}
	
	public MazoEntity(ArrayList<CartaEntity> cartasMazo, int cantidad) {
		super();
		this.cartasMazo = cartasMazo;
		this.cantidad = cantidad;
	}
	public void setIdMazo(int idMazo) {
		this.idMazo = idMazo;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void setCartasMazo(ArrayList<CartaEntity> cartasMazo) {
		this.cartasMazo = cartasMazo;
	}
	public int getIdMazo() {
		return idMazo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public ArrayList<CartaEntity> getCartasMazo() {
		return cartasMazo;
	}	
}
