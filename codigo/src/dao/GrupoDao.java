package dao;

public class GrupoDao implements daoInterface {
	
	private static GrupoDao instance;
	
	private GrupoDao() {}
	
	public static GrupoDao getInstance() {
		if (instance==null)
			instance = new GrupoDao();
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
