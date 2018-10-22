package dao;

public class UsuarioDao implements daoInterface {

	private static UsuarioDao instance;
	
	private UsuarioDao() {}
	
	public static UsuarioDao getInstance() {
		if (instance==null)
			instance = new UsuarioDao();
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
