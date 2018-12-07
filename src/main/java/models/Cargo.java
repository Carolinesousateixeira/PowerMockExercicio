package models;

public final class Cargo {
	private String nome;
	private Salario salario;
	
	public Cargo() {
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Salario getSalario() {
		return salario;
	}
	public void setSalario(Salario salario) {
		this.salario = salario;
	}	
}
