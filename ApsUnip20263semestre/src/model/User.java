package model;

public class User {
	//atributos do usuário
	private String nome;
	private String cidade;
	private String estado;
	private int pontos = 0;
	
	//Getters e Setters
	
	//Nome 
	public String GetNome() {
		return nome;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	//cidade
	public String GetCidade() {
		return cidade;
	}
	
	public void SetCidade(String cidade) {
		this.cidade = cidade;
	}
	
	//estado
	public String GetEstado() {
		return estado;
	}
	
	public void SetEstado(String estado) {
		this.estado = estado;
	}
	
	//Pontos
	
	public int GetPontos() {
		return pontos;
	}
	
	public void SetPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
	
	
}
