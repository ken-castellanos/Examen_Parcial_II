/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Medica_KKC;

/**
 *
 * @author kenk7
 */
public class Persona
{
 private String nombre;
 private Integer edad;
 private String direccion;
 
 public Persona(String nombre, Integer edad, String direccion)
    {
         this.nombre = nombre;
         this.edad = edad;
         this.direccion = direccion;
    }    

public String getnombre()
{
    return nombre;
}

public void setnombre(String nombre)
{
    this.nombre = nombre;
}

public Integer getedad()
{
    return edad;
}

public void setedad(Integer edad)
{
    this.edad = edad;
}

public String getdireccion()
{
    return direccion;
}

public void setdireccion(String direccion)
{
    this.direccion = direccion;
}

    void nombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
