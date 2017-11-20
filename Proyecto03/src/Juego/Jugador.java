package Juego;

public class Jugador {
	//Declaracion de atributos//
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private int puntuacion;
	private int id;
	
	//metodos get y set , para ver y modificar los atributos//
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String  nombre) {
		this.nombre=nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1=apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String  apellido2) {
		this.apellido2=apellido2;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public int getPuntuacion(){
		return puntuacion;
	}
	
	public void setPuntuacion(int puntuacion) {
		this.puntuacion=puntuacion;
	}
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	//metodo toString , para ver en pantalla//
	
public String toString() {
	return this.nombre+" "+this.apellido1+" "+this.apellido2+" "+this.edad;
}
}
