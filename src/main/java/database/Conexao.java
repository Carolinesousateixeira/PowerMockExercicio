package database;

public class Conexao {
	private static Conexao instancia;
	
	private Conexao() {
		
	}
	
	public static Conexao getInstancia() {
		if (instancia == null) {
			instancia = new Conexao();
		}
		return instancia;
	}
	
	public static boolean estaFechado() {
		return false;
	}
}
