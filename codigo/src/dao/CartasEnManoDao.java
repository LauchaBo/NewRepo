package dao;

public class CartasEnManoDao implements daoInterface {
	
	private static CartasEnManoDao instance;
	
	private CartasEnManoDao() {}
	
	public static CartasEnManoDao getInstance() {
		if (instance==null)
			instance = new CartasEnManoDao();
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
