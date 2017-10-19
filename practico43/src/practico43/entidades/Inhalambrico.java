/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.entidades;

/**
 *
 * @author Usuario
 */
public class Inhalambrico extends Telefono 
{
    private int canal;
    private double alcance;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public double getAlcance() {
        return alcance;
    }

    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }

    public Inhalambrico(int canal, double alcance, long numero, String modelo, String marca) {
        super(numero, modelo, marca);
        this.canal = canal;
        this.alcance = alcance;
    }
    
    
}
