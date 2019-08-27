package com.lucatinder.g3.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Perfil
 * 
 * Clase para modelar los datos de los perfiles.
 *
 * @version 1.0
 * @author Joaquin
 * 
 * 27/08/2019
 * 
 */


@Entity
@Table(name = "perfil") 
public class Perfil {

	private int id;
	private String correo;
	private String password;
	private String nombre;
	private String descripcion;
	private char genero;
	private char preferencias;
	private int edad;
	
	
	public Perfil() {
		
	}
	
	@Id
	@GeneratedValue
	@Column(name = "id_perfil")
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public char getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(char preferencias) {
		this.preferencias = preferencias;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "Perfil:\n\tId: " + id + ",\n\tCorreo: " + correo + ",\n\tPassword: " + password + ",\n\tNombre: " + nombre + ",\n\tEdad: " + edad + ",\n\tGénero: " + genero + ",\n\tPreferencias sexuales: " + preferencias + ",\n\tDescripcion: " + descripcion;
	}
	
}


