package br.com.jonathan.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carro implements Serializable{
	
	@Id
	@GeneratedValue
	private Long id;
	private String modelo;
	private String marca;
	private Long anoFabricacao;
	private String cor;
	private Double qtdLitro;
	private Double kmL;
	private Double autonomia;

	public Double getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(Double autonomia) {
		this.autonomia = autonomia;
	}
	public Double getQtdLitro() {
		return qtdLitro;
	}
	public void setQtdLitro(Double qtdLitro) {
		this.qtdLitro = qtdLitro;
	}
	public Double getKmL() {
		return kmL;
	}
	public void setKmL(Double kmL) {
		this.kmL = kmL;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Long getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Long anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
		
}
