package com.exercise30jsp.model;

public class Mensaje {
	//Campos
	private String texto;
	
	//Constructores
	public Mensaje()
	{
	}
	public Mensaje(String texto)
	{
		this.texto = texto;
	}
	//Getters y Setters
	public String getTexto()
	{
		return texto;
	}
	public void setTexto(String texto)
	{
		this.texto = texto;
	}
}
