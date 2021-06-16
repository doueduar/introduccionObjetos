package src;

import java.util.Scanner;

public class Fraccion {
    int n1,d1,n2,d2;
    Scanner scanner = new Scanner(System.in);

    public  Fraccion(int n1, int d1, int n2, int d2) {
        verificar(n1,d1,n2,d2);
    }
    public void verificar(int n1,int d1,int n2,int d2){
        if ((d1 == 0)&&(d2 == 0)) {
            System.out.print("ingrese otra fraccion1 ");
            n1 = scanner.nextInt();
            d1 = scanner.nextInt();
            n2 = scanner.nextInt();
            d2 = scanner.nextInt();
            verificar(n1, d1, n2, d2);
        }else{
            this.d1 = d1;
            this.d2 = d2;
            this.n1 = n1;
            this.n2 = n2;
        }
    }
    public void setFraccion1(int n1, int d1){
        this.d1 = d1;
        this.n1 = n1;
    }
    public void setFraccion2(int n2, int d2){
        this.d2 = d2;
        this.n2 = n2;
    }
    public String getFraccion1(){
        String fraccion;
        fraccion = n1+"/"+d1;
        return fraccion;
    }
    public String getFraccion2(){
        String fraccion;
        fraccion = n2+"/"+d2;
        return fraccion;
    }
    public void suma(){
        int suma = 0;
        int denominador = 0;
        if (d1==d2) {
            suma = n1+n2;
            denominador = d1;
        }else{
            denominador = d1*d2;
            suma = (d1*n2) + (d2*n1);
        }
        System.out.print("la suma de "+n1+"/"+d1+"+"+n2+"/"+d2+"="+suma+"/"+denominador);
    }
    public void resta(){
        int suma = 0;
        int denominador = 0;
        if (d1==d2) {
            suma = n1-n2;
            denominador = d1;
        }else{
            denominador = d1*d2;
            suma = (n1*d2) - (n2*d1);
        }
        System.out.print("la suma de "+n1+"/"+d1+"+"+n2+"/"+d2+"="+suma+"/"+denominador);
    }
    public void multiplicar(){
        int num, deno;
        num = n1*n2;
        deno = d1*d2;
        System.out.println("la multiplicacion: "+getFraccion1()+"*"+getFraccion2()+"="+num+"/"+deno);
    }
    public void dividir(){
        int num,deno;
        num = n1*d2;
        deno = d1*n2;
        System.out.println("la division de "+getFraccion1()+"/"+getFraccion2()+"="+num+"/"+deno);
    }

}
