package entities;


import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name="Bazas")
public class BazaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBaza;
	private int turno;
	@OneToMany 	(cascade = CascadeType.ALL)
	@JoinColumn (name="id_Baza")
	private ArrayList<JugadaEntity> jugadas;
	
	public BazaEntity() {
	}

	public BazaEntity(int idBaza, int turno, ArrayList<JugadaEntity> jugadas) {
		super();
		this.idBaza = idBaza;
		this.turno = turno;
		this.jugadas = jugadas;
	}

	public int getIdBaza() {
		return idBaza;
	}

	public void setIdBaza(int idBaza) {
		this.idBaza = idBaza;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public ArrayList<JugadaEntity> getJugadas() {
		return jugadas;
	}

	public void setJugadas(ArrayList<JugadaEntity> jugadas) {
		this.jugadas = jugadas;
	}
}
