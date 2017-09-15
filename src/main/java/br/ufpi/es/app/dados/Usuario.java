package br.ufpi.es.app.dados;

import java.util.Random;

public class Usuario {
	private int id;
	private String nome;
	
	public Usuario(String nome){
		Random gerador = new Random();
		this.id = gerador.nextInt(10000);
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
