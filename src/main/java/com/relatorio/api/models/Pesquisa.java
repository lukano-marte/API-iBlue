package com.relatorio.api.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PESQUISA")
public class Pesquisa implements Serializable{

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_pesquisa() {
		return nome_pesquisa;
	}

	public void setNome_pesquisa(String nome_pesquisa) {
		this.nome_pesquisa = nome_pesquisa;
	}

	public LocalDateTime getData_pesquisa() {
		return data_pesquisa;
	}

	public void setData_pesquisa(LocalDateTime data_pesquisa) {
		this.data_pesquisa = data_pesquisa;
	}

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String nome_pesquisa;
	
	private LocalDateTime data_pesquisa;
	
	
	
	
}
