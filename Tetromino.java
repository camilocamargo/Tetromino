import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dc96cac-759e-43fb-96d9-3ffd2a3d0239")
public class Tetromino {
    /**
     * <Enter note text here>
     */
    
    private char listaEstados;

    /**
     * <Enter note text here>
     */
    
    private boolean modificacion;

    
    private int tamañoFicha;

    /**
     * <Enter note text here>
     */
    public static  boolean fichaModificada();

    int getTamañoFicha() {
       
        return this.tamañoFicha;
    }

  
    void setTamañoFicha(final int value) {
      
        this.tamañoFicha = value;
    }
    
    public static void obtenerEstado(int matris[][]){
    }
    
    public static void obtenerFicha(){
    }

}
