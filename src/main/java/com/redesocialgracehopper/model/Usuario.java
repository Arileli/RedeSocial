package com.redesocialgracehopper.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String email;
	
	@NotNull
	private boolean status_conexao;
	
	@NotNull
	private String senha;
	
	@NotNull
	private String nome;
	
	@NotNull
	private Long codigo_usuario;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	
	private List<PostagemEntidade>postagementidade;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus_conexao() {
		return status_conexao;
	}

	public void setStatus_conexao(boolean status_conexao) {
		this.status_conexao = status_conexao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(Long codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

	public List<PostagemEntidade> getPostagementidade() {
		return postagementidade;
	}

	public void setPostagementidade(List<PostagemEntidade> postagementidade) {
		this.postagementidade = postagementidade;
	}
	
	

	
	
	
	
	

}
