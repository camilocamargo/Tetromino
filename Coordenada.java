import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("a3ea015e-0f6d-4289-802e-bed799a382b4")
public class Coordenada {
    @objid ("327583c8-a04f-4852-ae9a-f4a3524141a4")
    private int fila;

    @objid ("f3ec935f-b0eb-4b09-a18c-fda3e15dc1ec")
    private int columna;

    @objid ("7ec3a0ea-cdb5-4516-b165-6e3a8b443ea5")
    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    @objid ("967b47fc-5a6c-4b7a-8901-8febd6926ce1")
    public int getFila() {
        return this.fila
    }

    @objid ("485a0875-43d3-47c1-ac05-fdb8846195c4")
    public int getColumna() {
        return this.columna;
    }

}
