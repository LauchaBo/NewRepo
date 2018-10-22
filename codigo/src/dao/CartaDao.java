package dao;

public class CartaDao implements daoInterface {
	
	private static CartaDao instance;
	
	private CartaDao() {}
	
	public static CartaDao getInstance() {
		if (instance==null)
			instance = new CartaDao();
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
