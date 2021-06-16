package src;
import java.util.*;

public class cuadrado {
    private double l;
    public cuadrado(double lado){
        this.l = lado;
    }
    public void area(){
        double areaC = l*l;
        System.out.println("El area del cuadrado es: "+areaC);
    }
    public void perimetro(){
        double perimetroC = 4*l;
        System.out.println("el perimetro es: "+perimetroC);
    }
    public double getLado(){
        return l;
    }
    public void setLado(double lado){
        this.l = lado;
    }
}
