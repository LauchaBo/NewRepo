package dao;

public class BazaDao implements daoInterface {
	
	private static BazaDao instance;
	
	private BazaDao() {}
	
	public static BazaDao getInstance() {
		if (instance==null)
			instance = new BazaDao();
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
