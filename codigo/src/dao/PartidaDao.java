package dao;

public class PartidaDao implements daoInterface {
	
	private static PartidaDao instance;
	
	private PartidaDao() {}
	
	public static PartidaDao getInstance() {
		if (instance==null)
			instance = new PartidaDao();
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
