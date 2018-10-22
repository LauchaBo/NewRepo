package entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="Cartas")
public class CartaEntity  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarta;
	private int numero;
	private String palo;
	private int ranking;
	
	public CartaEntity() {
		
	}
	public CartaEntity(int numero, String palo, int ranking, boolean disponible) {
		this.numero=numero;
		this.palo=palo;
		this.ranking=ranking;
	}
	
	public int getNumero() {
		return this.numero;
	}
	public String getPalo() {
		return this.palo;
	}
	public boolean estaDisponible() {
		return this.disponible;
	}
	public int getRanking() {
		return this.ranking;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(int idCarta) {
		this.idCarta = idCarta;
	}

	public boolean isDisponible() {
		return disponible;
	}
	
}
