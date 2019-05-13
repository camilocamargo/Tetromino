
public class Coordenada {
    
    private int filaInicio;
    private int filaFin;
    private int columnaInicio;
    private int columnaFin;

    public Coordenada(int filaInicio, int filaFin, int columnaInicio, int columnaFin) {
        this.filaInicio = filaInicio;
		this.filaFin = filaFin;
        this.columnaInicio = columnaInicio;
		this.columnaFin = columnaFin;
    }


    public int getCoordena() {
        int [] coordenada = {this.filaInicio, this.filaFin, this.columnaInicio, this.columnaFin};
		return; 
    }
}
