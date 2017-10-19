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
public abstract class Telefono {
    private long numero;
    private String modelo;
    private String marca;

    public Telefono(long numero, String modelo, String marca) {
        this.numero = numero;
        this.modelo = modelo;
        this.marca = marca;
    }

    public abstract boolean llamar(long nroDestino);
    
    
    
    
}
