package com.senai.Ana.Laura.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

   //Atributos da classe
@Entity
@Table (name = "tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nome")
	private String nCliente;
	
	@Column (name = "telefone")
	private String fone;

	//metodos da classe
	public Long getidcCliente () {
		return idcCliente;	
	}
	
	public String getnCliente () {
		return nCliente;
		
	}
	 
	public String getfone () {
		return fone;
		
	}
	public void setidcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
		
		
	}
	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
		
	}
	
	public void setfone(String fone) {
		this.fone = fone;
		
	}
	
	
}
