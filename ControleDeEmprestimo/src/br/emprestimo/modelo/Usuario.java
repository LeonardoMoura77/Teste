package br.emprestimo.modelo;

import java.util.Objects;

public class Usuario {
	private String ra;

	private String nome;

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		if (ra == "" | ra == null) {
			throw new RuntimeException("RA inv�lido.");
		}
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == "" | nome == null) {
			throw new RuntimeException("Usu�rio inv�lido.");
		}
		this.nome = nome;
	}

	@Override
	public boolean equals(Object obj) {
			// auto verifica��o
			if (this == obj)
				return true;
			// verifica��o nula
			if (obj == null)
				return false;
			// verifica��o de tipo e cast
			if (getClass() != obj.getClass())
				return false;
			// compara��o de atributos
			Usuario usuario = (Usuario) obj;
			return Objects.equals(nome, usuario.nome) && Objects.equals(ra, usuario.ra);
	}

}
