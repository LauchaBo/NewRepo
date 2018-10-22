package dao;

public class ManoDao implements daoInterface {
	
	private static ManoDao instance;
	
	private ManoDao() {}
	
	public static ManoDao getInstance() {
		if (instance==null)
			instance = new ManoDao();
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
