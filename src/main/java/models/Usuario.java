package models;

public class Usuario {
	private int id;
	private String usuario;
	private String senha;
	private String nomeCompleto;
	private Cargo cargo;
	
	public Usuario() {
		
	}
	
	public Usuario(String usuario, String senha, String nomeCompleto, Cargo cargo) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.nomeCompleto = nomeCompleto;
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	private String segredo() {
		return "segredo";
	}
	public String getSegredo() {
		return this.segredo();
	}
	
}
