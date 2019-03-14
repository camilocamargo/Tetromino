import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class FichaT extends Tetromino{
    
    public static int[][] estado0 = {{1,1,1},{0,1,0},{0,1,0}};
    public static int[][] estado1 = {{0,0,1},{1,1,1},{0,0,1}};
    public static int[][] estado2 = {{0,1,0},{0,1,0},{1,1,1}};
    public static int[][] estado3 = {{1,0,0},{1,1,1},{1,0,0}};
    
    public FichaI(){
        super();
        this.listaEstados.add(estado0, estado1, estado2, estado3);
    }
    
    @override
    public void rotarDerecha(){
        if(this.estado == 3){
            estado = 0;
        }else{
            estado++;
        }
    }
    
    @override
    public void rotarIzquierda(){
        if(this.estado == 0){
            estado = 3;
        }else{
            estado--;
        }
    }
}
