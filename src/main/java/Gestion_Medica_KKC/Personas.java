/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_Medica_KKC;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kenk7
 */
public class Personas
{
    public static void main(String[] args)
    {
    Persona a = new Medico("Oripathia", 10, "Profesor_Doctor", 28, "Ursus");
    Persona b = new Paciente(2, "Oripathia", "Ethan", 16, "Bolivar");
    List<Persona> lista = new ArrayList<Persona>();
    lista.add(a);
    lista.add(b);
    
    }
}
