/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.entidades;

/**
 *
 * @author Federico Alaniz
 */
public class Persona 
{
    private long dni;
    private String nombre;
    
    public long getDni()
    {
        return dni;
    }
    
    public void setDni(long dni)
    {
        this.dni=dni;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public  void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public Persona(long dni,String nombre)
    {
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public void llamarMensajear(Telefono tel,long nroDestinatario, String mensaje)
    {
        System.out.println("El mensaje se envio con exito.");
    }
    
    public void llamarMensajear(Telefono tel, long nroDestinatario)
    {
        System.out.println("Llamando a: "+ nroDestinatario);
    }
}
