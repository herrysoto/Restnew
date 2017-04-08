package com.herry.soto.ws.rest.vo;

public class VOUsuario {
	private String nombre;
	private String contrasena;
	private boolean validacion;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public boolean isValidacion() {
		return validacion;
	}
	public void setValidacion(boolean validacion) {
		this.validacion = validacion;
	}
	
	
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.nombre + " , " + this.contrasena;
//	}
}
