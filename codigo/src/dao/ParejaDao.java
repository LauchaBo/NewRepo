package dao;

public class ParejaDao implements daoInterface {
	
	private static ParejaDao instance;
	
	private ParejaDao() {}
	
	public static ParejaDao getInstance() {
		if (instance==null)
			instance = new ParejaDao();
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
