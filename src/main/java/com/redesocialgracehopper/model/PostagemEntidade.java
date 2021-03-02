package com.redesocialgracehopper.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class PostagemEntidade {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_postagem;

	@NotNull
	private String titulo;

	@Size(min=7,max=5000)
	private String conteudo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date data_publicacao = new java.sql.Date(System.currentTimeMillis());

	private String imagem;

	private int saldo_reacoes=0;

	@ManyToOne
	@JsonIgnoreProperties("postagementidade")
	private Tema tema;

	@ManyToOne
	@JsonIgnoreProperties("postagementidade")
	private Usuario usuario;

	public long getId_postagem() {
		return id_postagem;
	}

	public void setId_postagem(long id_postagem) {
		this.id_postagem = id_postagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(Date data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getSaldo_reacoes() {
		return saldo_reacoes;
	}

	public void setSaldo_reacoes(int saldo_reacoes) {
		this.saldo_reacoes = saldo_reacoes;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	

}
