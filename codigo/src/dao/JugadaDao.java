package dao;

public class JugadaDao implements daoInterface {
	private static JugadaDao instance;
	
	private JugadaDao() {}
	
	public static JugadaDao getInstance() {
		if (instance==null)
			instance = new JugadaDao();
		return instance;
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
