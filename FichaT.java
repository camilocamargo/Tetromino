public class FichaT extends Tetromino{
    
    public int[][] estado0 = {{1,1,1},{0,1,0},{0,1,0}};
    public int[][] estado1 = {{0,0,1},{1,1,1},{0,0,1}};
    public int[][] estado2 = {{0,1,0},{0,1,0},{1,1,1}};
    public int[][] estado3 = {{1,0,0},{1,1,1},{1,0,0}};
    
    public FichaT(Coordenada ubicacion){
        super(ubicacion);
        this.estados.add(0, this.estado0);
	    this.estados.add(1, this.estado1);
	    this.estados.add(2, this.estado2);
	    this.estados.add(3, this.estado3);
    }
    
    @Override
    public void rotarDerecha(){
        if(this.estado == 3){
            this.estado = 0;
        }else{
            this.estado++;
        }
    }
    
    @Override
    public void rotarIzquierda(){
        if(this.estado == 0){
            this.estado = 3;
        }else{
            this.estado--;
        }
    }
}
