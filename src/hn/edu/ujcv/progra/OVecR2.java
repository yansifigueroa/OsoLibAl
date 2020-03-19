package hn.edu.ujcv.progra;

public class OVecR2 {
    // miembros
    private double y;
    private double x;

    // accesoras y mutadoras

    // metodos
    public OVecR2 suma(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = x + b.x;
        a1.y = y + b.y;

        return new OVecR2();
    }

    public OVecR2 resta(OVecR2 b){
        //TODO: implementar
        return new OVecR2();
    }

    public double prodPunto(OVecR2 b){
        //TODO: implementar
        return 0.0f;
    }

    public double magnitud(){
        //TODO: implementar
        return 0.0f;
    }


    // constructores
    public OVecR2(){}

    public OVecR2(OVecR2 a){}

    public OVecR2(double x, double y){}
}
