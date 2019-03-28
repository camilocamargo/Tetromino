import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dc96cac-759e-43fb-96d9-3ffd2a3d0239")
public class Tetromino {
        
    private ArrayList estados = new ArrayList();
    
    private int estado;
    private Coordenada ubicacion;
    
    public Tetromino(coordenada){
        this.estado = 0;
    }

    
    public static void obtenerEstado(){
        return this.estados.get(this.estado);
    }
    
    public static void obtenerFicha(){
        return this;
    }
    
    public void rotarDerecha(){}
    
    public void rotarIzquierda(){}
   
    public void desplazarIzquierda(Coordenada){}
    
    public void desplazarDerecha(Coordenada){}
    
    public Coordenada obtenerUbicación(){}
        
    public void caer(){}

}
