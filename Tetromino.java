/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetromino;

import java.util.ArrayList;

public class Tetromino {
        
    private ArrayList estados = new ArrayList();
    
    private int estado;
    private Coordenada ubicacion;
    
    public Tetromino(Coordenada coordenada){
        this.estado = 0;
        this.ubicacion = coordenada;
    }

    
    public int obtenerEstado(){
        return this.estado;
    }
    
    public void rotarDerecha(){}
    
    public void rotarIzquierda(){}
   
    public void desplazarIzquierda(){
        this.ubicacion.columnaInicio--;
        this.ubicacion.columnaFin--;
    }
    
    public void desplazarDerecha(){
        this.ubicacion.columnaInicio++;
        this.ubicacion.columnaFin++;
    }
    
    public Coordenada obtenerUbicación(){
        return this.ubicacion;
    }
        
    public void caer(int filaInicio, int filaFin){
        this.ubicacion.filaInicio = filaInicio;
        this.ubicacion.filaFin = filaFin;
    }

}
