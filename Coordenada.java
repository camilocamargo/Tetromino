public class Coordenada {
    
    public int filaInicio;
    public int filaFin;
    public int columnaInicio;
    public int columnaFin;

    public Coordenada(int filaInicio, int filaFin, int columnaInicio, int columnaFin) {
        this.filaInicio = filaInicio;
        this.filaFin = filaFin;
        this.columnaInicio = columnaInicio;
	this.columnaFin = columnaFin;
    }


    public int[] getCoordena() {
        int [] coordenada = {this.filaInicio, this.filaFin, this.columnaInicio, this.columnaFin};
	return coordenada; 
    }
}
