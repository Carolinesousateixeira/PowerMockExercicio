package models;

public class Salario {
	private double valor;
	private String tipo;
	
	public Salario() {
		
	}

	public final double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
