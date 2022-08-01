package br.com.dio.model;

import java.util.Objects;

public class Ravioli {
	
	private String nome;
	private String molho;
	private Integer qtde;
	public Ravioli() { 	}
	public Ravioli(String nome, String molho, Integer qtde) {
		this.nome = nome;
		this.molho = molho;
		this.qtde = qtde;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public Integer getQtde() {
		return qtde;
	}
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	@Override
	public int hashCode() {
		return Objects.hash(molho, nome, qtde);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ravioli other = (Ravioli) obj;
		return Objects.equals(molho, other.molho) && Objects.equals(nome, other.nome)
				&& Objects.equals(qtde, other.qtde);
	}
	@Override
	public String toString() {
		return "Ravioli [nome=" + nome + ", molho=" + molho + ", qtde=" + qtde + "]";
	}
	
	

	 /* public Ravioli (String nome; String molho, Integer qtde) {
	            this. nome = nome;
	            this.molho =molho;
	            this.qtde = qtde;    */
			
}
