package hn.edu.ujcv.progra;

import java.awt.*;

public class OVecR2 {
    // miembros
    private double y;
    private double x;

    // accesoras y mutadoras

    public OVecR2 suma(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = x + b.x;
        a1.y = y + b.y;

        return new OVecR2();
    }

    public OVecR2 resta(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        return new OVecR2();
    }

    public double productoPunto(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = x * b.x;
        a1.y = y * b.y;
        double a = a1.x + a1.y;
        return a;
    }

    public double escalaPorVector(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        double alpha = 0;

        a1.x = alpha * x;
        a1.y = alpha *y;
        return 0.0f;
    }

    public double magnitud(OVecR2 b){
        //TODO: implementar
        OVecR2 a1 = new OVecR2();
        a1.x = (b.x) - x;
        a1.y = (b.y) - y;
        return Math.sqrt(x);
    }

    // constructores
    public OVecR2(){}

    public OVecR2(OVecR2 a){}

    public OVecR2(double x, double y){}
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
