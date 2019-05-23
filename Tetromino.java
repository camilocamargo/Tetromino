import java.util.ArrayList;

public class Tetromino {
        
    protected ArrayList<int[][]> estados = new ArrayList<int[][]>();
    
    protected int estado;
    protected Coordenada ubicacion;
    
    public Tetromino(Coordenada ubicacion){
        this.estado = 0;
        this.ubicacion = ubicacion;
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
