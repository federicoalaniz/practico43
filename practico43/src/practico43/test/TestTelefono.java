/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.test;
import practico43.entidades.*;

/**
 *
 * @author Usuario
 */
public class TestTelefono 
{
    public static void main(String[] args)
    {
        Telefono cel = new Fijo("Domestica", 437138,"2hj4","Samsung");
        Persona p=new Persona(39992375,"Romina");
        p.llamarMensajear(cel, 15557892);
        p.llamarMensajear(cel, 15851526, "Hola. Que tal?");
    }
}
