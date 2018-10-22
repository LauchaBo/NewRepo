package dao;

public class JuegoDao implements daoInterface{

	private static JuegoDao instance;
	
	private JuegoDao() {}
	
	public static JuegoDao getInstance() {
		if (instance==null)
			instance = new JuegoDao();
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
