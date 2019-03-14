import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class FichaI extends Tetromino{
    
    public static int[][] estado0 = {{0,0,1,0},{0,0,1,0},{0,0,1,0},{0,0,1,0}};
    public static int[][] estado1 = {{0,0,0,0},{1,1,1,1},{0,0,0,0},{0,0,0,0}};
    
    public FichaI(){
        super();
        this.listaEstados.add(estado0, estado1);
    }
    
    @override
    public void rotarDerecha(){
        if(this.estado == 1){
            estado = 0;
        }else{
            estado++;
        }
    }
    
    @override
    public void rotarIzquierda(){
        if(this.estado == 0){
            estado = 1;
        }else{
            estado--;
        }
    }
}
