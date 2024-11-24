/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Medica_KKC;

/**
 *
 * @author kenk7
 */
public class Medico extends Persona
{
    private String especialidad;
    private Integer anyoexp;
    
    public Medico(String especialidad, Integer anyoexp, String nombre, Integer edad, String direccion)
    {
        super(nombre, edad, direccion);
        this.especialidad = especialidad;
        this.anyoexp = anyoexp;
    }
    
public String getespecialidad()
{
    return especialidad;
}

public void setespecialidad(String especialidad)
{
    this.especialidad = especialidad;
}

public Integer anyoexp()
{
    return anyoexp;
}

public void anyoexp(Integer anyoexp)
{
    this.anyoexp = anyoexp;
}
}
