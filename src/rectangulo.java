package src;

import java.util.Scanner;

public class rectangulo {
    private double ancho,largo;
    Scanner scanner = new Scanner(System.in);

    public rectangulo(double ancho,double largo){
        verificar(ancho, largo);
    }

    public void verificar(double a,double l){
       if (a == l) {
           System.out.print("los valores son iguales es un cuadrado ingresa otros valores:");
           verificar(a, l);            
            
       }else{
            if ((0<a)&&(0<l)) {
                this.ancho = a;
                this.largo = l;
            }else{
                System.out.println("Los valores son negativos ingresa otros valores");
                a = scanner.nextDouble();
                l = scanner.nextDouble();
                verificar(a,l);
            }
       }
    }
    public void perimetroR(){
        double perimetroR = 2*ancho+2*largo;
        System.out.print("el perimetro es: "+perimetroR);
    }
    public void areaR(){
        double areaR = ancho*largo;
        System.out.println("el area es: "+areaR);
    }
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    public void setLargo(double largo){
        this.largo = largo;
    }
    public double getAncho(){
        return ancho;
    }
    public double getLargo(){
        return largo;
    }

}
