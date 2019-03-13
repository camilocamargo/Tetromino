import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8dc96cac-759e-43fb-96d9-3ffd2a3d0239")
public class Tetromino {
    /**
     * <Enter note text here>
     */
    @objid ("bd41b960-eace-4bfc-8b18-76978b986ea6")
    private char listaEstados;

    /**
     * <Enter note text here>
     */
    @objid ("e37bccc8-5f6c-484e-b18f-0f5dbc210021")
    private boolean modificacion;

    @objid ("78e5ebfd-5e23-47aa-bd2f-06c9ccfe2784")
    private int tamañoFicha;

    /**
     * <Enter note text here>
     */
    @objid ("b7e647ce-3600-42ff-b704-b7c279d38ea9")
    public Coordenada coordenada;

    @objid ("2f85941a-aa1b-45e4-85c4-d71163de635c")
    public static native boolean fichaModificada();

    @objid ("5caad939-3b77-4df8-95ac-b3facb589a92")
    int getTamañoFicha() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.tamañoFicha;
    }

    @objid ("cfafecd9-ffbb-47b3-a615-ec153a77450c")
    void setTamañoFicha(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.tamañoFicha = value;
    }

}
