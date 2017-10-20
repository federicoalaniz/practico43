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
public class Celular extends Telefono{
    private String empresa;

    public Celular(String empresa, long numero, String modelo, String marca) {
        super(numero, modelo, marca);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public boolean llamar(long nroDestino){
        return true;
    }
    public boolean enviarMensaje(long nroDestino, String mensaje){
        System.out.println("Mensaje a: "+nroDestino);
        System.out.println(mensaje);
        return true;
    }
}
