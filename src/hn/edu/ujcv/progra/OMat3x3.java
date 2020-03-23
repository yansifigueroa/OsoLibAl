package hn.edu.ujcv.progra;

public class OMat3x3 {
    // miembros


    // accesoras y mutadoras

    // metodos

    // constructores
    private OVecR3 colX;
    private OVecR3 colY;
    private OVecR3 colZ;



    public OMat3x3(){
        colX = new OVecR3(1,0, 0);
        colY = new OVecR3(0,1,0);
        colZ = new OVecR3(0,0,1);
    }

    public OMat3x3(OVecR3 colX, OVecR3 colY, OVecR3 colZ){
        this.colX = new OVecR3(colX);
        this.colY = new OVecR3(colY);
        this.colZ = new OVecR3(colZ);
    }

    public OMat3x3(OMat3x3 b){
        this.colX = new OVecR3(b.colX);
        this.colY = new OVecR3(b.colY);
        this.colZ = new OVecR3(b.colZ);}


    public static OVecR3 rotacionZ (double angulo, OVecR3 vector){
        OVecR3 retval = new OVecR3();

        return retval;
    }

    // public static OVecR2 rotacionX (double angulo, IGVecR2 vector){
//
//    }

    // public static OVecR2 rotacionY (double angulo, IGVecR2 vector){
//
//    }

    public OVecR3 getColX() {
        return colX;
    }

    public void setColX(OVecR3 colX) {
        this.colX = colX;
    }
    public OVecR3 getColY() {
        return colY;
    }

    public void setColY(OVecR3 colY) {
        this.colY = colY;
    }
    public OVecR3 getColZ() {
        return colZ;
    }

    public void setColZ(OVecR3 colZ) {
        this.colZ = colZ;
    }
}
