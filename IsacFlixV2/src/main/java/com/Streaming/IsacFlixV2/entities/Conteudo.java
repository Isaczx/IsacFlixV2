package com.Streaming.IsacFlixV2.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="conteudo")
public class Conteudo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String descricao;
	private String imagem;
	private int views;
	
	public Conteudo() {
		super();
	}

	public Conteudo(String name, String descrcao, String imagem, int views) {
		super();
		this.name = name;
		this.descricao = descrcao;
		this.imagem = imagem;
		this.views = views;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrcao() {
		return descricao;
	}

	public void setDescrcao(String descrcao) {
		this.descricao = descrcao;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, imagem, name, views);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conteudo other = (Conteudo) obj;
		return Objects.equals(descricao, other.descricao) && id == other.id && Objects.equals(imagem, other.imagem)
				&& Objects.equals(name, other.name) && views == other.views;
	}
	
	
	
	
	
}
