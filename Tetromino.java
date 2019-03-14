import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dc96cac-759e-43fb-96d9-3ffd2a3d0239")
public class Tetromino {
        
    private ArrayList listaEstados = new ArrayList();
    
    private boolean modificacion;

    private int tamañoFicha;
    
    private int estado;
    
    public Tetromino(){
        this.estado = 0;
    }

    public boolean fichaModificada();

    public int getTamañoFicha() {
       return this.tamañoFicha;
    }
  
    public void setTamañoFicha(int value) {
        this.tamañoFicha = value;
    }
    
    public static void obtenerEstado(){
        return this.estado;
    }
    
    public static void obtenerFicha(){
        return this;
    }
    
    public abstract void rotarDerecha();
    
    public abstract void rotarIzquierda();

}
