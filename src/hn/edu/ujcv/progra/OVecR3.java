package hn.edu.ujcv.progra;

import java.awt.*;

public class OVecR3 {
    // miembros

    private double x;
    private double y;
    private double z;

    // accesoras y mutadoras

    public OVecR3(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public OVecR3(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public OVecR3(OVecR3 b){
        this.x = b.x;
        this.y = b.y;
        this.z = b.z;
    }


    public OVecR3 suma(OVecR3 b){
        //TODO: implementar
        OVecR3 a1 = new OVecR3();
        a1.x = x + b.x;
        a1.y = y + b.y;
        a1.z = z + b.z;
        return new OVecR3();
    }

    public OVecR3 resta(OVecR3 b){
        //TODO: implementar
        OVecR3 a1 = new OVecR3();
        a1.x = x - (b.x);
        a1.y = y - (b.y);
        a1.z = z - (b.z);
        return new OVecR3();
    }

    public OVecR3 prodCruz(OVecR3 b){
        OVecR3 a1 = new OVecR3();
        a1.x = (b.z*y)-(b.y*z);
        a1.y = (b.x*z)-(b.z*x);
        a1.z = (b.y*x)-(b.x*y);
        return new OVecR3();
    }

    public double prodPunto(OVecR3 b){
        //TODO: implementar
        OVecR3 a1 = new OVecR3();
        a1.x = x * b.x;
        a1.y = y * b.y;
        a1.z = z * b.z;
        double a = a1.x + a1.y + a1.z ;        return 0.0f;
    }


    // metodos

    // constructores
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
