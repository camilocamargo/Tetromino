public class FichaI extends Tetromino{
    
    public int[][] estado0 = {{0,0,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}};
    public int[][] estado1 = {{0,0,0,0},{1,1,1,1},{0,0,0,0},{0,0,0,0}};
    
    public FichaI(Coordenada ubicacion){
        super(ubicacion);
        this.estados.add(0, this.estado0);
	    this.estados.add(1, this.estado1);
    }
    
    @Override
    public void rotarDerecha(){
        if(this.estado == 1){
            this.estado = 0;
        }else{
            this.estado++;
        }
    }
    
    @Override
    public void rotarIzquierda(){
        if(this.estado == 0){
            this.estado = 1;
        }else{
            this.estado--;
        }
    }
}
