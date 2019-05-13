public class Tetromino {
        
    private ArrayList estados = new ArrayList();
    
    private int estado;
    private Coordenada ubicacion;
    
    public Tetromino(coordenada){
        this.estado = 0;
    }

    
    public static void obtenerEstado(){
        return this.estado;
    }
    
    public void rotarDerecha(){}
    
    public void rotarIzquierda(){}
   
    
	public void desplazarIzquierda(Coordenada){
		 int [] coordenada = {this.filaInicio, this.filaFin, this.columnaInicio--, this.columnaFin--};
		
	}
    
    public void desplazarDerecha(Coordenada){
		 int [] coordenada = {this.filaInicio, this.filaFin, this.columnaInicio++, this.columnaFin++};
	}
    
    public Coordenada obtenerUbicación(){
		int [] cordenadaFinal = {this.filaInicio, this.filaFin, this.columnaInicio, this.columnaFin};
	
	}
        
    public void caer(){
		int [] coordenada = {this.filaInicio++, this.filaFin++, this.columnaInicio, this.columnaFin};
	}

}
