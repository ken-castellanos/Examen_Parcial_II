/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Medica_KKC;

/**
 *
 * @author kenk7
 */
public class Paciente extends Persona
{
 private Integer nrohistorial;
 private String enfermedad;

    public Paciente(Integer nrohistorial, String enfermedad, String nombre, Integer edad, String direccion)
    {
        super(nombre, edad, direccion);
        this.nrohistorial = nrohistorial;
        this.enfermedad = enfermedad;
    }
    public Integer getnrohistorial()
    {
        return nrohistorial;
    }

    public void setnrohistorial(Integer nrohistorial)
    {
        this.nrohistorial = nrohistorial;
    }

    public String getenfermedad()
    {
        return enfermedad;
    }

    public void setenfermedad(String enfermedad)
    {
        this.enfermedad = enfermedad;
    }
 }
