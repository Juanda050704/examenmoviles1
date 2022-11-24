package org.example;

public class Jugador {

   public String nombre;
   public int edad;
   public String apellidos;
   public int numerodecamiseta;
   public String posicion;
   public String equipo;

//CONTRUTOR


    public Jugador() {
    }

    public Jugador(String nombre, int edad, String apellidos, int numerodecamiseta, String posicion, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.numerodecamiseta = numerodecamiseta;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumerodecamiseta() {
        return numerodecamiseta;
    }

    public void setNumerodecamiseta(int numerodecamiseta) {
        this.numerodecamiseta = numerodecamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setApellido(int next) {
    }

    public void setEquipoDondeJuega(int next) {
    }

    public void setNumeroCamiseta(int nextInt) {
    }
}
