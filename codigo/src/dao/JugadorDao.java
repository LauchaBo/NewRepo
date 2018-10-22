package dao;

public class JugadorDao implements daoInterface {
	
	private static JugadorDao instance;
	
	private JugadorDao() {}
	
	public static JugadorDao getInstance() {
		if (instance==null)
			instance = new JugadorDao();
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
