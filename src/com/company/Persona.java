package com.company;


import static java.lang.Integer.parseInt;

public class Persona {
    private String nombre;
    private String ciudad = Default_City;
    private String edad =  Default_Age;

    private static final String Default_City = "Unknown";
    private static final String Default_Age = "0";

    public int getEdad() {
        return  Integer.parseInt(edad);
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getCiudad() {
        return ciudad ;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    @Override
    public String toString() {
        return "Nombre: "+nombre+" Poblacion: "+ciudad+" Edad: "+edad;
    }


}
